package com.example.oopdemo

import android.util.Log

class Driver(name:String) {
    var driverName =""

  init {
      driverName = name
  }
    fun showDetails(){
        Log.i("MyTag","Name of the driver is $driverName")
    }
}