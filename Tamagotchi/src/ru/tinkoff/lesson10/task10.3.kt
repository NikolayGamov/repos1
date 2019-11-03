package ru.tinkoff.lesson10

fun main()
{
    val smesharikiList = listOf<String>("Крош", "Ёжик", "Нюша", "Бараш")
    val smesharikiArrayList = arrayListOf<String>()

    for(smesharik in smesharikiList)
        smesharikiArrayList.add(smesharik)

    for(smesharik in smesharikiArrayList)
        println(smesharik)
}