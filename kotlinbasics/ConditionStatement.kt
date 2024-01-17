package com.example.kotlinbasics

fun main() {
  /*  var number:Int= readLine()!!.toInt()

    println("Enter your Number")
    if(number>0)
    {
        println("the given number is positive")
    }
    else
    {
        println("the given number is negative")
    }*/
    println("Enter your Number")
    var n:Int= readLine()!!.toInt()
    if (n %2==0)
    {
        println("The given number is even"+n)
    }
    else
    {
        println("the given number is odd"+n)
    }
}