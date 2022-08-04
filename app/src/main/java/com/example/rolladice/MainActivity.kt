package com.example.rolladice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * This class allows user to roll a dice through a button on screen
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_roll: Button = findViewById(R.id.bt_roll)

        bt_roll.setOnClickListener { rollDice() }
    }

    /**
     * It creates 2 dices and, roll it and show the result to the user
     */
    private fun rollDice() {
        val dice = Dice(6)
        var resultNumber = dice.roll()
        //TextViews instantied here
        val tv_number: TextView = findViewById(R.id.tv_number)
        val tv_number2: TextView = findViewById(R.id.tv_number2)

        tv_number.text = resultNumber.toString()
        resultNumber = dice.roll()
        tv_number2.text = resultNumber.toString()
    }

}


