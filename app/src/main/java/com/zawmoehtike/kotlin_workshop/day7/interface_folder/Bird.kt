package com.zawmoehtike.kotlin_workshop.day7.interface_folder

class Bird : Pet, Wild {
    // Polymorphism သဘောတရား
    override fun eat() {
        println("Bird is eating")
    }

    override fun sleep() {
        println("Bird is sleeping")
    }

    override fun move() {
        println("Bird is moving")
    }

    override fun fly() {
        println("Bird is flying")
    }

    override fun run() {
        println("Bird is running")
    }

    override fun swim() {
        println("Bird cannot swim")
    }

    override fun makeDangerToHuman() {
        println("Bird destroy crop")
    }
}