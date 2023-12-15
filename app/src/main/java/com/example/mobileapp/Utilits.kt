package com.example.mobileapp

class Utilits
{
    fun ResultTest(selectedSystem:Int,number:Int):String{
        val result = when (selectedSystem) {
            8 ->Integer.toOctalString(number)
            10 -> Integer.toString(number)
            16 -> Integer.toHexString(number)
            else -> ""
        }
        return result
    }
}