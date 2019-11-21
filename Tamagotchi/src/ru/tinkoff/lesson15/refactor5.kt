package ru.tinkoff.lesson15

fun main()
{
    println("Введите a и b:  ")
    val a = scan.nextInt()
    val b = scan.nextInt()
    print(mult(a,b))
}

fun mult(a: Int, b: Int) = a * b // 1 строка вместо 5