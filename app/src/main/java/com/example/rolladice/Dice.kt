package com.example.rolladice

class Dice (private val numberSide:Int){

    fun roll(): Int {
        return (1..numberSide).random()
    }

}