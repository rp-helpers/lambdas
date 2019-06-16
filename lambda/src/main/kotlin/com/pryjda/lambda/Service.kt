package com.pryjda.lambda

fun main(args: Array<String>) {

    println("hello me here")

//    val lambdaName: Type = { argumentList -> codeBody}
// infered - wnioskować

    val anything = { number: Int -> number * number }
    println(anything(15))

    val task = { arg: Int -> (arg * 100).toString() }
    println(task(190))
    val anything2: (Int) -> Int = { one -> one + 3 }
    println(anything2(4))
//    val more : (String, Int)->String={}
    val display: (String) -> Unit = { text -> println(text) }
    display("coś napiszę")

    val sth: (String, Double) -> Double = { one, two -> one.toDouble() + two }
    display(sth("123", 1.4).toString())

    val another: String.(Int) -> String = { this + it }

//    val another1 = another("1234")

    val result = Service().extendString("999", 1)
    display(result)

    val calculateGrade = { grade: Int ->
        when (grade) {
            in 0..40 -> "Fail"
            in 41..70 -> "Pass"
            in 71..100 -> "Distinction"
            else -> false
        }
    }

    display(calculateGrade(101).toString())

    val calc = fun(grade: Int): String {
        if (grade < 0 || grade > 100)
            return "Error"
        else if (grade < 40)
            return "Fail"
        else if (grade < 70)
            return "Pass"
        return "Distinction"
    }

    display(calc(44))

    val array = arrayOf(1, 2, 3, 4, 5, 6)
    array.forEach { item -> println(item) }
    array.forEach { println(it) }


//    display(Service.invokeLambda {it })

}


class Service {

    fun extendString(arg: String, num: Int): String {
        val another: String.(Int) -> String = { this + it }
        return arg.another(num)
    }
    companion object{
        fun invokeLambda(lambda: (Double) -> Boolean): Boolean{
            return lambda (4.22)
    }

    }


}

fun display() {

}