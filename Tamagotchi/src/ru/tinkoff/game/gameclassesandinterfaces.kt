package ru.tinkoff.game

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

interface Flyable
{
    fun fly()
}

interface Walkable
{
    fun walk()
}

interface Swimable
{
    fun swim()
}

interface Crawlable
{
    fun crawl()
}

interface Voiceable
{
    fun voice()
}

abstract class Pet()
{
    var isFriendly = true
    private var purity = 1

    fun purityIncr()
    {
        if (purity < 1)
            purity++
    }

    fun purityDecr()
    {
       purity--
    }

    fun eat()
    {
        println("Om-nom-nom")
        gotoilet()
        sleep()
    }

    fun sleep()
    {
        if(purity >= 0)
            println("hrrrrrrrrr")
        else
            goaway()
    }

    fun gotoilet()
    {
        println("...!?!...")
    }

    fun goaway()
    {
        println("Go away!")
        isFriendly = false
    }
}

class PetOwner( private var mypet: Pet)
{
    fun getFriendlyPet(): Boolean
    {
        return mypet.isFriendly
    }

    fun setPet(pet: Pet)
    {
        mypet = pet
    }

    fun feed()
    {
        println("food in bowl!")
        mypet.purityDecr()
        mypet.eat()
    }

    fun clean()
    {
        mypet.purityIncr()
        println("cleaning done!")
    }
}


