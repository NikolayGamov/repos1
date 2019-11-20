package ru.tinkoff.lesson15

val goodNightBabies = listOf("Хрюша", "Степаша", "Филя", "Гуля") // тип элементов списка указывать не обязательно

fun printPersonages(personages: List<String>)
{
    for( personage in personages )
        println( personage )
}

fun main()
{
    // Добавлен asSequence(), чтобы не копировать коллекцию
    printPersonages(goodNightBabies.asSequence().map{"Привет, $it"}.toList())
}