package ru.tinkoff.lesson12

fun main()
{
    print( goodNightBabies.find{ personage -> personage == goodNightBabies.maxBy {it.length} } )
}