package ru.tinkoff.lesson8

import
import
fun main(args: Array<String>) = runBlocking { //(1)
    val job = launch(CommonPool) { //(2)
        val result = suspendingFunction() //(3)
        println("$result")
    }
    println("The result: ")
    job.join() //(4)
}