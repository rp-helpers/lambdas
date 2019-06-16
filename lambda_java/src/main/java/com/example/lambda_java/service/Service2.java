package com.example.lambda_java.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Service2 {

    public static void main(String[] args) {

        Single try1 = new Single();
        try1.setText("try1");

        Single try2 = new Single();
        try2.setText("try2");

        Single try3 = new Single();
        try3.setText("try3");

        Single try4 = new Single();
        try4.setText("try4");

        Single try5 = new Single();
        try5.setText("try5");

        List<Single> lista = new ArrayList(Arrays.asList(try1, try2, try3, try4, try5));

        System.out.println(lista);

//        try3 = new Single("nowy");
        try3.setText("nowy");
        System.out.println(lista);

        lista.stream().filter(it -> !it.getText().equals("try1")).forEach(item -> item.setText("nowy ze streama"));
        System.out.println(lista);

        Stream oneStream = lista.stream().map(it -> it.text = it.toString() + "_dodatek");

//        System.out.println(oneStream.collect(Collectors.toList())); // wniosek: dopiero gdy jest operacja konczaca - zrodlo stumienia jest zmianine np wg metody map()
        System.out.println("lista ost: " + lista);


    }


}
