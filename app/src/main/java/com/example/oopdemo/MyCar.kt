package com.example.oopdemo

import android.util.Log

class MyCar:Car(), SpeedController{
    override fun start() {
     Log.i("MyTag","This is MyCar Starting...Bland Id is ${getBrandId()}")
    }

    override fun accelerate() {

    }

    override fun decelerate() {

    }

}

