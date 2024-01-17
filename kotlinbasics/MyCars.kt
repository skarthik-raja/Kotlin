package com.example.kotlinbasics

import androidx.lifecycle.AndroidViewModel

class MyCars constructor(var name:String, var model:Int) {


    init {
        println("mycar name is ${name} and model is ${model}")
    }
}