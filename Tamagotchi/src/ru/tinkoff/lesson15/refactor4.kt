package ru.tinkoff.lesson15

import java.util.*

val scan = Scanner(System.`in`)
fun main()
{
    // построен список и использована штатная функция нахождения минимума => меньше строк
    // связывание количества вводимых и считываемых чисел
    val numbers = mutableListOf<Int>()
    val numb = 4
    println("Введите $numb числа:  ")
    for(i in 1..numb)
        numbers.add(scan.nextInt())

    println(numbers.min())
}