package com.example.kotlinbasics

fun main(args: Array<String>) {
    var car=Car()
    car.type="car"
    car.model="ferarai"
    car.maxspeed=320

    car.show()

    //creating an object for motorcycle

    println("------------------------------------")

    var motor = MotorCycle()
    motor.type="Motorcycle"
    motor.model="yamaha"
    motor.maxspeed=180
    motor.show()
}