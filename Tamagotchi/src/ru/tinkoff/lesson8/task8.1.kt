package ru.tinkoff.lesson8

fun main()
{
    listOf("three", "two", "one").forEach {

        if(it == "one") {
            return@forEach // Проблема была в том, что return означает выход из функции, в которой вызывается,
        }                  // соответственно на one вызывался return, который осуществлял выход из main.
        println(it)        // Чтобы вернуться не из main, а из if, необходимо указать @foreach,
    }                      // что означает вернуться к циклу. Таким образом, возвращаемся в foreach,
                           // завершаем его и выводим далее "boom!"
    println("boom!")
}