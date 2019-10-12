package ru.tinkoff.fromlesson6


class Pet()
{
    lateinit var nickname: String
    var age = 0
    var sex: String? = null
}

fun main()
{
    // Using "apply"

    val dog = Pet().apply {
        nickname = "Bobik"
        age = 5
        sex = "M"
    }


    // Using "also"

    val cat = Pet().also {
        it.nickname = "Murka"
        it.age = 7
        it.sex = "Ж"
    }


    // Using "let"

    val hamster = Pet()

   hamster.let {
        it.nickname = "Homa"
        it.age = 2
        it.sex = "M"
    }


    // Using "with"

    val frog = Pet()

    with(frog) {
        nickname = "Kva"
        age = 6
        sex = null
    }


    val pets: Array<Pet> = arrayOf(dog, cat, hamster, frog)

    for( i in pets )
        println( "nickname: ${i.nickname}, age: ${i.age}, sex: ${i.sex}")

    // Более подходят для инициализации полей apply и with с одной стороны - так как не нужно ссылаться с помощью it.
    // С другой стороны - apply и also, так как не нужно заранее создавать экземпляр класса с неинициализированными полями.

    // Таким образом, мне кажется, что самый удобный способ - использовать apply, удобность использования with и also зависит от конкретного задания.


}
