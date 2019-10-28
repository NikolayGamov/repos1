package ru.tinkoff

import kotlinx.coroutines.*

fun main()
{
    val pet1 = Pet("Sharik", 1600)
    val pet2 = Pet("Barsik", 5000)
    val pet3 = Pet("Muhtar", 2000)
    val pet4 = Pet("Bobik", 1000)
    val pet5 = Pet("Murka", 3000)

    // Задание 1

    runBlocking {
        launch { pet1.eat() }
        launch { pet2.eat() }
        launch { pet3.eat() }
        launch { pet4.eat() }
        launch { pet5.eat() }
    }
    println("Животные накормлены")
}