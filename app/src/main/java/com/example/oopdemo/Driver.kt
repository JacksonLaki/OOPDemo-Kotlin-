package com.example.oopdemo

import android.util.Log

open class Driver(name:String , credit:Int) {


    private var driverName =""
    private var totalCredit = 10

  init {
      totalCredit+= credit
      driverName = name
  }
    fun showDetails(){
        Log.i("MyTag","Name of the driver is $driverName and $totalCredit")
    }
}