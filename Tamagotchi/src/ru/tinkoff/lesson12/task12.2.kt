package ru.tinkoff.lesson12

val goodNightBabies = listOf<String>("Хрюша", "Степаша", "Филя", "Гуля")

fun printPersonages(personages: List<String>)
{
    for( personage in personages )
        println( personage )
}

fun main()
{
    printPersonages(goodNightBabies.map{"Привет, $it"})
}