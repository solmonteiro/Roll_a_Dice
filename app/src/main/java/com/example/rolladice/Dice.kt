package com.example.rolladice

class Dice (val numberSide:Int){

    fun roll(): Int {
        return (1..numberSide).random()
    }

}