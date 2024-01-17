package com.example.kotlinbasics

fun main() {

    println("The complete basic details")

    println("Your Name is")
    var name:String?= readLine()
    println("Your age is")
    var age:Int= readLine()!!.toInt()
    println("Your choosed course is")
    var course:String?= readLine()

    println("your name is $name")
    println("your age is $age")
    println("your course is $course")

}