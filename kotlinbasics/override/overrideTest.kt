package com.example.kotlinbasics.override

fun main(args: Array<String>) {

    var vechile= Vehicle()

    vechile.start()
    vechile.accelerate(100)
    vechile.stop()

println("--------------------------------")
    //creating an object for car

    var car = Car()

    car.superstart()
    car.superaccelrate()
    car.superstop()
    println("--------------------------------")

    car.start()
    car.stop()
    car.accelerate(80)
}