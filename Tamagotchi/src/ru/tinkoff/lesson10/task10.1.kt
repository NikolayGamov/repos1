package ru.tinkoff.lesson10

fun main()
{
    val smesharikiList = listOf<String>("Крош", "Ёжик", "Нюша", "Бараш")

    val smesharikiSet = setOf<String>("Крош", "Ёжик", "Нюша", "Бараш")

    for(smesharik in smesharikiList + smesharikiSet)
        println(smesharik)
}