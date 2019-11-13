package ru.tinkoff.lesson10

fun main()
{
    // Задание 1
    val smesharikiList = listOf<String>("Крош", "Ёжик", "Нюша", "Бараш")
    val smesharikiArrayList = arrayListOf<String>()

    for(smesharik in smesharikiList)
        smesharikiArrayList.add(smesharik)

    for(smesharik in smesharikiArrayList)
        println(smesharik)

    // Задание 2
    val smesharikiSet = mutableSetOf<String>()

    for(smesharik in smesharikiList)
        smesharikiSet.add( smesharik )

    for(smesharik in smesharikiSet)
        println(smesharik)
}