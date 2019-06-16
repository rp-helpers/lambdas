package com.pryjda.lambda

class ForTEst {
   fun invokeLambda(lambda: (Double) -> Boolean): Boolean {
        return lambda(4.22)
    }
}

fun main(args: Array<String>){

    val lambda: (Double)-> Boolean = {arg -> arg == 4.22}
//    println(ForTEst().invokeLambda({arg -> arg == 4.22}))
    println(ForTEst().invokeLambda(lambda))
}