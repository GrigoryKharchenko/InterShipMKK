package com.example.mkk
// task for example 2
class Lancer {

    private var engine: Double = 0.0
    private var color: String = ""
    private var wheels: Int = 0

    fun carInfoEng(): Double = engine


    fun carInfoColor(): String = color


    fun carInfoWheels(): Int = wheels


    fun setColor(value: String) {
        color = value
    }

    fun setWheel(value: Int) {
        wheels = value
    }

    fun setEngine(value: Double) {
        engine = value
    }
}
