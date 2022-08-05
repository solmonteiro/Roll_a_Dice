package com.example.rolladice


import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
fun generate_numbers(){
    val dice = Dice(6)
        val numberResult=dice.roll()

        assertTrue("Range retorno do dado fora do intervalo 1..6",numberResult in 1..6)

}
}