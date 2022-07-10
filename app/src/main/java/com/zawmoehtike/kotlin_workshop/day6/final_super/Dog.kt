
package day6.final_super

class Dog: Animal() {

    override fun eat() {
        println("eating bread...")
    }

    fun bark() {
        println("barking...")
    }

    fun work() {
        super.eat() // call super method eat()
        eat() // call method eat()
        bark()
    }
}