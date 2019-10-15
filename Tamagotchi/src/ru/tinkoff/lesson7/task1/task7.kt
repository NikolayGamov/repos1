package ru.tinkoff.lesson7.task1

// Task 1

open class Pet(val nickname: String, val age: Int, val sex: String?)

fun Pet.isAdult(): Boolean
{
    return age >= 2
}

val Pet.respectableNickname: String
    get() = "Dear $nickname"


// Task 2

class Dog(nickname: String, age: Int, sex: String?): Pet(nickname, age, sex)

fun Dog.isChild(): Boolean
{
    return age < 2
}


// Task 3

class Cat(nickname: String, age: Int, sex: String?): Pet(nickname, age, sex)


class Owner<Pet>( val pet: Pet )
{
    fun feed(): String
    {
        return "Домашнее животное $pet накормлено"
    }
}


fun main()
{
    // Task 1

    val dog = Pet("Muhtar", 3, "M")

    println( dog.isAdult() )
    println(dog.respectableNickname)


    // Task 2

    val puppy: Pet = Dog("Barbos", 1, "M")

   // println(puppy.isChild) // Ошибка. Так как мы создали объект наследника под типом класса-родителя,
                             // доступны только методы, определенные для класса родителя. Для данного объекта
                             // метод isChild недоступен


    // Task 3

    val hozyain = Owner( Pet("sdawrg", 6, "M") )



    println(hozyain.feed())

}