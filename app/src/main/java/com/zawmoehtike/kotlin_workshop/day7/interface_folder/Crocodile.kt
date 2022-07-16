package com.zawmoehtike.kotlin_workshop.day7.interface_folder

import com.zawmoehtike.kotlin_workshop.day7.interface_folder.Wild

class Crocodile : Wild {
    // Polymorphism သဘောတရား
    override fun makeDangerToHuman() {
        println("Crocodile eat human")
    }
}