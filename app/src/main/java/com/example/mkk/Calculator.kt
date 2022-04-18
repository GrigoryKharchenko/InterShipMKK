package com.example.mkk

// task for example
class Calculator {

    private var a: Double = 0.0
    private var b: Double = 0.0

    fun getA(): Double {
        return a
    }

    fun getB(): Double {
        return b
    }

    fun setAB(valueA: Double, valueB: Double) {
        a = valueA
        b = valueB
    }

    fun getPlus(): Double {
        return a + b
    }

    fun getDiv(): Double {
        if (a == 0.0 || b == 0.0) {
            return 0.0
        } else {
            return a / b
        }

    }

    fun getMulti(): Double {
        if (a == 0.0 || b == 0.0) {
            return 0.0
        } else {
            return a * b
        }
    }
}
