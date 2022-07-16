package com.zawmoehtike.kotlin_workshop.day7.interface_folder

interface Pet {
    fun eat()
    fun sleep()
    fun move()
    fun fly()
    fun run()
    fun swim()

    companion object {
        // Pet Interface
        const val type = "Pet"
    }
}