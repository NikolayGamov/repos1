package ru.tinkoff.lesson15

interface Comparator<Person>
{
    fun compare(person1: Person, person2: Person): Boolean
}


object singlePerson: Comparator<Person>
{
    override fun compare(person1: Person, person2: Person): Boolean
    {
        return person1.equals(person2)
    }
}