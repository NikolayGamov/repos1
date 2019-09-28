fun main(args: Array<String>)
{
    println("Введите a и b:  ")
    val a = scan.nextInt()
    val b = scan.nextInt()
    print(mult(a,b))
}

fun mult(a: Int, b: Int): Int
{
    val prod = a * b
    return prod
}