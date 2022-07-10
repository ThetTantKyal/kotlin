package day6.overriding

open class Parent {
    open fun showToast() {
        println("Parent's Toast")
    }

    open fun showProperties() {
        println("Cars, Houses, Bikes, Lands")
    }
}