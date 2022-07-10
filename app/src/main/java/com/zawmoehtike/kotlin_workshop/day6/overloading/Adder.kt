package day6.overloading

class Adder {
    fun sum(n1: Int, n2: Int) { // original
        println(n1 + n2)
    }

    fun sum(n1: Int, n2: Int, n3: Int) { // overload
        println(n1 + n2 + n3)
    }

    fun sum(n1: Int, n2: Int, n3: Int, n4: Int) { // overload
        println(n1 + n2 + n3 + n4)
    }
}