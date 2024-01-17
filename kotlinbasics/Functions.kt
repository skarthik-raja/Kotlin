package com.example.kotlinbasics

fun main() {

    println("Enter the value for number 1")
    var number1:Int= readLine()!!.toInt()

    println("Enter the value for number 1")
    var number2:Int= readLine()!!.toInt()
    show(number1,number2)
    add(number1,number2)
}
fun show(num1:Int , num2:Int)
{
    println("you entered number is $num1 and $num2")
}

fun add(num1: Int, num2: Int):Int
{
    var sum:Int=0;
    sum=num1+num2
    return  sum
}