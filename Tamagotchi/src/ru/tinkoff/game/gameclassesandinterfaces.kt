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
    var isHungry = true
    var isFriendly = true
    private var purity = 1

    fun askForEat()
    {
        println("Give me food!\t\t\t Pet asks for eat")
    }

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
        println("Om-nom-nom\t\t\t Pet eats")
        isHungry = false
        gotoilet()
        sleep()
    }

    fun sleep()
    {
        if(purity >= 0)
        {
            println("hrrrrrrrrr\t\t\t Pet sleeps")
            isHungry = true
            askForEat()
        }
            else
            goaway()
    }

    fun gotoilet()
    {
        println("...!?!...\t\t\t Pet goes toilet")
    }

    fun goaway()
    {
        println("Go away!\t\t\t Pet leaved home")
        isFriendly = false
    }
}

class PetOwner( var mypet: Pet)
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
        println("food in bowl!\t\t\t PetOwner feeds pet")
        mypet.purityDecr()
        mypet.eat()
    }

    fun clean()
    {
        mypet.purityIncr()
        println("cleaning done!\t\t\t PetOwner cleaned pet`s area")
        if(mypet.isHungry)
            mypet.askForEat()
    }
}


