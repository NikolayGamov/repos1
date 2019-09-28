import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>)
{
    print("Введите имя:  ")
    val name = scan.nextLine()

    print("Введите число 1:  ")
    val a = scan.nextDouble()

    print("Введите число 2:  ")
    val b = scan.nextDouble()

    println("$name получает $a через $b лет.")
}