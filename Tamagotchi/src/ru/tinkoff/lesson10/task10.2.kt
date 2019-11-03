package ru.tinkoff.lesson10

fun main()
{
    val smesharikiArrayList = arrayListOf<String>("Крош", "Ёжик", "Нюша", "Бараш")

    val smesharikiHashSet = hashSetOf<String>("Крош", "Ёжик", "Нюша", "Бараш")

    for(smesharik in smesharikiArrayList + smesharikiHashSet)
        println(smesharik)
}