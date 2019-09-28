import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>)
{
    print("Введите строку:  ")
    val S = scan.nextLine()

    print("Введите N:  ")
    val N = scan.nextInt()

    printStr(N, S)
}

fun printStr(N:Int, S: String)
{
    for(i in 1..N)
        println(S)
}