package com.example.kotlinbasics

open class vehicle {

    var type:String?=null
    var model:String?=null
    var maxspeed:Int?=null

    fun show()
    {
        println("the vehicle type is ${type}")
        println("the vehicle model is ${model}")
        println("the vehicle maxspeed is ${maxspeed}")

    }
}