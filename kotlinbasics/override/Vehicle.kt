package com.example.kotlinbasics.override

open class Vehicle {



    open fun start()

    {
        println("car has started")
    }
    open fun accelerate(speed:Int)
    {
        println("car has accelrated $speed")
    }
    open fun stop()
    {
        println("car has been stoped")
    }
}