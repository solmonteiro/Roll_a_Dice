package com.example.rolladice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_roll: Button = findViewById(R.id.bt_roll)

        bt_roll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val resultNumber = dice.roll()
        val tv_number: TextView = findViewById(R.id.tv_number)
        tv_number.text = resultNumber.toString()
    }

}


