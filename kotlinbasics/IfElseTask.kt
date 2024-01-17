package com.example.kotlinbasics

fun main() {
    println("Enter your age : ?")
    var age:Int= readLine()!!.toInt()
    println("the elible age to vote is 18")

    if (age>=18)
    {
        println("The age is $age to vote")
    }
    else
    {
        println("the age is $age is not eligible")
    }
}