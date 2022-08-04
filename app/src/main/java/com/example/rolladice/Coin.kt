package com.example.rolladice

class Coin {
    val sides = listOf("cara", "coroa")

    fun flip(): String {
        return sides.random()
    }
}