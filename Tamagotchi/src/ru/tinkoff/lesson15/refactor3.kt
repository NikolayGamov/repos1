package ru.tinkoff.lesson15

fun main()
{
    // не нужен find
    print( goodNightBabies.maxBy {it.length} )
}