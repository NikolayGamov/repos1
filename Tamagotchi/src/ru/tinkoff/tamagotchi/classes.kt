package ru.tinkoff.tamagotchi


class Dog (val name: String, val age: Int) : Pet(), Walkable, Voiceable
{
    override fun walk() {
        println("walking dog")
    }

    override fun voice() {
        println("Baw-wow!")
    }
}

class Cat (val name: String, val age: Int) : Pet(), Walkable, Voiceable
{
    override fun walk() {
        println("walking cat")
    }

    override fun voice() {
        println("Meow-meow!")
    }
}

class Parrot (val name: String, val age: Int) : Pet(), Flyable, Voiceable
{
    override fun fly() {
        println("flying parrot")
    }

    override fun voice() {
        println("kurlyk!")
    }
}

class Snake (val name: String, val age: Int) : Pet(), Crawlable, Voiceable
{
    override fun crawl() {
        println("Crawling snake")
    }

    override fun voice() {
        println("Shshsh!")
    }
}

class Fish (val name: String, val age: Int) : Pet(), Swimable
{
    override fun swim() {
        println("Swimming fish")
    }
}

fun main()
{
    val dog = Dog("Barbos", 3)
    val cat = Cat("Barsik", 5)
    val parrot = Parrot("Popka", 1)
    val snake = Snake("Zavr", 7)
    val fish = Fish("Nemo", 2)

    println(fish.name)
    parrot.voice()
    cat.sleep()
}