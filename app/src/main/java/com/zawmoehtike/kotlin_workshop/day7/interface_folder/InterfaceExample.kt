package com.zawmoehtike.kotlin_workshop.day7.interface_folder

import com.zawmoehtike.kotlin_workshop.day1.Child
import kotlin.jvm.JvmStatic

object InterfaceExample {
    // Interface Example or Polymorphism Example
    @JvmStatic
    fun main(args: Array<String>) {
        val cChild = Child()

        // Polymorphism သဘောတရား
        val petCat: Pet = Cat()
        val petDog: Pet = Dog()
        val petBird: Pet = Bird()
        val petGoldFish: Pet = GoldFish()

        // Polymorphism သဘောတရား
        petBird.eat()
        petBird.fly()
        petCat.eat()
        petCat.fly()

        // Polymorphism သဘောတရား
        val wildSnake: Wild = Snake()
        val wildCrocodile: Wild = Crocodile()

        // Polymorphism သဘောတရား
        wildCrocodile.makeDangerToHuman()
        wildSnake.makeDangerToHuman()
    }
}