package ru.tinkoff.lesson15

data class Person (val surname: String, val name: String, val age: Int, val index: Int, val number: Long)
{
    companion object : Comparator<Person>
    {
        override fun compare(person1: Person, person2: Person): Boolean
        {
            return person1 == person2
        }
    }
}

fun main()
{
    // удалось избежать инициализации лишних переменных путём замены array на list
    // + мелкие исправления по подсказкам IDE - .equals() to ==
    val persons = mutableListOf<Person>()

    persons.add(Person("Иванов", "Сергей", 35, 573924, 824598235))
    persons.add(Person("Егоров", "Иван", 64, 694302, 825939395))
    persons.add(Person("Егоров", "Иван", 64, 694302, 825939395))
    persons.add(Person("Петров", "Александр", 19, 456302, 859394395))
    persons.add(Person("Егоров", "Иван", 64, 694302, 825939395))

    for(i in 0 until persons.size)
    {
        for( j in i + 1 until persons.size)
        {
            if(persons[i] == persons[j])
                println("persons[$i] идентичен persons[$j]")
        }
    }

    println(singlePerson.compare(persons[0], persons[2]))
    println(Person.compare(persons[1], persons[2]))
    println(singlePerson.compare(persons[4], persons[2]))
    println(Person.compare(persons[3], persons[0]))

}