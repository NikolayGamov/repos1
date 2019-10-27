package ru.tinkoff

import kotlinx.coroutines.*

class Pet ( val nickname: String, val mealDuration: Long ) {
    suspend fun eat() {
            delay(mealDuration)
            println("${nickname} покушал")
        }
}