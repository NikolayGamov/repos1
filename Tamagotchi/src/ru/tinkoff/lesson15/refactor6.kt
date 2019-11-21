package ru.tinkoff.lesson15

fun main()
{
    val str = scan.next()
    print(str.isCapitalized())
}

fun String.isCapitalized() = this.first().isUpperCase() // расширение вместо отдельной функции
