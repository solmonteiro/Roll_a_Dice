package com.example.rolladice

/**
 * This class allows to create an dice object with one propertie and one method.
 *
 */

class Dice (private val numberSide:Int){

    fun roll(): Int {
        return (1..numberSide).random()
    }

}