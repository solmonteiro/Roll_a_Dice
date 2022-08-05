package com.example.rolladice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        //ImageView instantied here
        val diceImage: ImageView = findViewById(R.id.imgView)

        when (resultNumber) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }


    }

}


