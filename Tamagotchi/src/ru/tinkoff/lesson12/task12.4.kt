package ru.tinkoff.lesson12

fun maxElemLen(list: List<String>): Int
{
    var maxLen = 0
    for( element in list ) {
        if (element.length > maxLen)
            maxLen = element.length
    }
    return maxLen
}

fun main()
{
    print(goodNightBabies.find{it.length == maxElemLen(goodNightBabies)})
}