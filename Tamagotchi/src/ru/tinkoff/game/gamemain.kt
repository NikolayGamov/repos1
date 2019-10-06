package ru.tinkoff.game

import java.util.Scanner
val scan = Scanner(System.`in`)

fun main()
{
    val dog = Dog("Barbos", 3)
    val cat = Cat("Barsik", 5)
    val parrot = Parrot("Popka", 1)
    val snake = Snake("Zavr", 7)
    val fish = Fish("Nemo", 2)

    val petowner = PetOwner(Dog("0",0))

    println("Выберите питомца и введите его номер:\n1) Собака\n2) Кошка\n3) Попугай\n4) Змея\n5) Рыбка\n")
    val pet = scan.nextInt()
    println("Имя питомца")
    val name = scan.next()

    when(pet)
    {
        1 -> petowner.setPet(Dog(name, 0))
        2 -> petowner.setPet(Cat(name, 0))
        3 -> petowner.setPet(Parrot(name, 0))
        4 -> petowner.setPet(Snake(name, 0))
        5 -> petowner.setPet(Fish(name, 0))
    }

    var event = 10

    while(event != 0 && petowner.getFriendlyPet())
    {
        println("0 - выйти из игры\n1 - покормить питомца\n2 - убрать за питомцем\n")
        event = scan.nextInt()

        if(event == 1)
            petowner.feed()

        else if(event == 2)
            petowner.clean()
    }
    println("Finish game!")
}