package com.example.kotlinbasics

import androidx.core.text.trimmedLength

fun main(args: Array<String>) {

    //hello program
    println("hello kotlin")
    println("--------------------------------------------")
    //data types
    // mutable
    var name = "karthik"
    var age = 20
    name="raja"
    println(name)
    println(age)
    println("--------------------------------------------")
    //immutable
    val num1 = 10
    println(num1)
    println("--------------------------------------------")
    //string
    var s1:String=" Kanini Excellence redfined"
    var s2:String="Academy"
    println(s1);
    println(s1.lowercase())
    println(s1.uppercase())
    println(s1.equals(s2))
    println(s1.trim())
    println(s1.isEmpty())
    println(s1+" "+s2)
    var i = s1.length
    println("length of the string is "+i);

    println("--------------------------------------------")

    //Array
    var course = arrayOf("Java","Kotlin","C#","python")
    println("the total no of course is :"+ course[0])
    println("the total no of course is :"+ course[1])
    println("the total no of course is :"+ course[2])
    println("the total no of course is :"+ course[3])

    println("--------------------------------------------")

    var n1=ArrayList<Int>()
    n1.add(100)
    n1.add(1,200)
    n1.add(300)

//    println("the first element of the arraylist is "+n1[0])
//    println("the first element of the arraylist is "+n1.get(1))
//    println("the first element of the arraylist is = ${n1[2]}")
    println("--------------------------------------------")

    n1.remove(300)
    println(n1.size)
    println("the first element of the arraylist is "+n1[0])
    println("the first element of the arraylist is "+n1.get(1))
    n1.set(1,500)
    println(n1)
    println("--------------------------------------------")

    var n2 = mapOf<String,Int>("Karthik" to 22,"Raja" to 21)
    println("the name  = ${n2["Karthik"]} ")
    println("the name is = ${n2["Raja"]}")


}