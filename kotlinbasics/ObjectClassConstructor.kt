package com.example.kotlinbasics

fun main(args: Array<String>) {

  /*  var mycars = Cars()
    mycars.name="Audi"
    mycars.model=2021

    var cars = Cars()
    cars.name="Ferari"
    cars.model=2020

    println("your cards name is ${mycars.name} mode is ${mycars.model}")
    println("your cards name is ${cars.name} mode is ${cars.model}")*/

    //creating an object from class

//    var myCars=MyCars("Audi",2020)
//    println("mynew car name is ${myCars.name} and model is ${myCars.model}")

    var mySecondCar= MySecondCars("Ferarai",2022)

    //setting the value for updated one
    mySecondCar.name="Eeco"
    mySecondCar.model=2013

    println("mynew secondcar name is ${mySecondCar.name} and model is ${mySecondCar.model}")


}