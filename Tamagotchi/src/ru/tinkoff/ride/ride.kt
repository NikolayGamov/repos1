package ru.tinkoff.ride

import java.util.Scanner

class Car() {
    fun ride(km: Int) {
        var kmleft = km
        println("Поехали!")
        while ( kmleft > 0)
        {
            println("осталось $kmleft километров")
            kmleft--
        }
        println("Приехали!")
    }
}
val scan = Scanner(System.`in`)

fun main(args: Array<String>) {
    val car = Car()
    car.ride(scan.nextInt())
}