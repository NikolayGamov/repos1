package ru.tinkoff.lesson12

fun main()
{
    val filteredList = goodNightBabies.asSequence().filter { it.length <= 4 }.map { "Привет, $it" }.toList()

    printPersonages( filteredList )
}