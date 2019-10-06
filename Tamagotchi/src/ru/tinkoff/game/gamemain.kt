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

    val petowner = PetOwner(dog)

    println("Выберите питомца и введите его номер:\n1) Собака\n2) Кошка\n3) Попугай\n4) Змея\n5) Рыбка\n")
    val pet = scan.nextInt()

    when(pet)
    {
        1 -> petowner.setPet(dog)
        2 -> petowner.setPet(cat)
        3 -> petowner.setPet(parrot)
        4 -> petowner.setPet(snake)
        5 -> petowner.setPet(fish)
    }

    petowner.feed()
    petowner.clean()
    petowner.feed()
    petowner.feed()

}