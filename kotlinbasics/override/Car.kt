package com.example.kotlinbasics.override

class Car: Vehicle() {

    fun superstart()
    {
        super.start()
    }
    fun superaccelrate()
    {
    super.accelerate(100)
    }

    fun superstop()
    {
super.stop()
    }

    override fun start()

    {
        println("vehicle has started")
    }
    override fun accelerate(speed:Int)
    {
        println("vehicle has accelrated $speed")
    }
    override fun stop()
    {
        println("vehcile has been stoped")
    }

}