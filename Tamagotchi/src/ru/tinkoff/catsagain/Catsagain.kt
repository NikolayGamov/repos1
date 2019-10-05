package ru.tinkoff.catsagain

open class Cat {
    open fun hunt () {
        println("Я охочусь на мышей, ведь я кот!")
    }
}

class HomeCat : Cat()
{
    fun hunt(isHunter: Boolean)
    {
        if(isHunter)
            hunt() //не пишем super<Cat>, т.к. метод переопределён с другим набором переменных
        else
            println("Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!")
    }
}

fun main()
{
    val cat = HomeCat()
}
