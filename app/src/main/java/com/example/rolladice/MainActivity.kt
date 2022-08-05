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

        //Do a dice roll when the app starts
        rollDice()
    }



    /**
     * It creates 1 dice and, roll it and show the result to the user
     */
    private fun rollDice() {
        val dice = Dice(6)
        val resultNumber = dice.roll()
        //ImageView instantied here
        val diceImage: ImageView = findViewById(R.id.imgView)

//Define the rool image to show according with te number
        val drawableResource = when (resultNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = (resultNumber.toString())

    }

}


