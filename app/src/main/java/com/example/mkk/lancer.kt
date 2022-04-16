package com.example.mkk

class Lancer {

    private var engine: Double = 0.0
    private var color: String = ""
    private var wheels: Int = 0

    fun carInfoEng(): Double {
        return engine
    }

    fun carInfoColor(): String {
        return color
    }

    fun carInfoWheels(): Int {
        return wheels
    }

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