package com.zawmoehtike.kotlin_workshop.day7.interface_folder

import com.zawmoehtike.kotlin_workshop.day7.interface_folder.Pet

class Cat : Pet {
    // Polymorphism သဘောတရား
    override fun eat() {
        println("Cat is eating")
    }

    override fun sleep() {
        println("Cat is sleeping")
    }

    override fun move() {
        println("Cat is moving")
    }

    override fun fly() {
        println("Cat cannot fly")
    }

    override fun run() {
        println("Cat is running")
    }

    override fun swim() {
        println("Cat cannot swim")
    }
}