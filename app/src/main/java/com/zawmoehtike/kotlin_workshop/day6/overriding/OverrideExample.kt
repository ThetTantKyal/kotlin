package day6.overriding

object OverrideExample {

    @JvmStatic
    fun main(args: Array<String>) {
        val child1 = Child()
        child1.showToast()
        child1.showProperties()
    }
}