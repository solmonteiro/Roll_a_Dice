package com.example.rolladice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


fun main() {

    rollDice()
    flipCoin()
}

fun rollDice() {
    val myFirstDice = Dice(6)
    println(myFirstDice.roll())
}

fun flipCoin(){
    val myCoin=Coin()
    println(myCoin.flip())
}