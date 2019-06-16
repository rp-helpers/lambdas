package com.pryjda.lambda

import java.util.stream.IntStream

class Service2 {
}

fun main(args: Array<String>) {

    val one = mutableListOf<String>("jeden", "dwa", "trzy", "cztery")

    val oneV2 = one.map {
        it + "v2"
    }

    println(one)
    println(oneV2)

    oneV2.forEach { println(it) }
    oneV2.forEach { println(it) }

    println(listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9).map { x -> x * x }.filter { y -> y < 10 })
    println(listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9).asSequence().map { x -> x * x }.filter { y -> y < 10 }.toList())

//https://blog.kotlin-academy.com/effective-kotlin-use-sequence-for-bigger-collections-with-more-than-one-processing-step-649a15bb4bf

    val target = mutableListOf<Int>()

    listOf<Int>(1, 2, 3, 4, 5).mapTo(target) { n -> n * 100 }
    println(target)


    val oneTest = mutableListOf<Single>(Single("jeden"), Single("dwa"), Single("trzy"), Single("cztery"))
//    val secondTest = oneTest.map{it-> it+"123"}
//    println("secondTest: $secondTest")
    println()
    println()
    println()
    println()
    println("oneTest: $oneTest")

    val secondTest = oneTest.filter { it.text == "dwa" }
    println("secondTest: $secondTest")

    secondTest.map { it.text = it.text + "_additional" }

    println("oneTest: $oneTest")
    println("secondTest: $secondTest")

    println()
    println()
    var text1 = "tresc1"
    text1 = text1 + "_cos"
    println(text1)

    /* var try1 = "try1"
     var try2 = try1

     try2 = "nowy"
     println(try1)
     println(try2)*/

//    var try1 = Single("one")
//    var try2 = try1
//
//    try2.text = "nowy"
//    println(try1)
    println()

    var try1 = Single("try1")
    var try2 = Single("try2")
    var try3 = Single("try3")
    var try4 = Single("try4")
    var try5 = Single("try5")
//    try3 = "nowy"
    val lista = mutableListOf(try1, try2, try3, try4, try5)
    println(lista)

    try3.text = "nowy"
    println(lista)

    lista.asSequence().map {
        if (it.text == "try2")
            it.text = "nowy ze streama"
    }.forEach {  }

    println("lista: " + lista)
    lista.map {
        if (it.text == "try2")
            it.text = "nowy ze streama"
    }

    println(lista)


}
