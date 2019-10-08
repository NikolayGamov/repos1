package ru.tinkoff.task56

data class Person (val surname: String, val name: String, val age: Int, val index: Int, val number: Long)
{
    companion object : Comparator<Person>
    {
        override fun compare(person1: Person, person2: Person): Boolean
        {
            return person1.equals(person2)
        }
    }
}

fun main()
{
    val numOfPers = 5
    val human0 = Person("", "", 0, 0, 0)

    val humans: Array<Person> = Array(numOfPers, {human0} )


    humans[0] = Person("Иванов", "Сергей", 35, 573924, 824598235)
    humans[1] = Person("Егоров", "Иван", 64, 694302, 825939395)
    humans[2] = Person("Егоров", "Иван", 64, 694302, 825939395)
    humans[3] = Person("Петров", "Александр", 19, 456302, 859394395)
    humans[4] = Person("Егоров", "Иван", 64, 694302, 825939395)

    for(i in 0 .. numOfPers - 1)
    {
        for( j in i + 1 .. numOfPers - 1)
        {
            if(humans[i].equals(humans[j]))
                println("humans[$i] идентичен humans[$j]")
        }
    }

    println(singlePerson.compare(humans[0], humans[2]))
    println(Person.compare(humans[1], humans[2]))
    println(singlePerson.compare(humans[4], humans[2]))
    println(Person.compare(humans[3], humans[0]))

}