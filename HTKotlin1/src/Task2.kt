fun main(args: Array<String>)
{
    println("Введите 4 числа:  ")
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    val d = scan.nextInt()

    println(min(a,b,c,d))
}

fun min(a: Int, b: Int, c: Int, d: Int): Int
{
    val input: IntArray = intArrayOf(a, b, c, d)
    var min: Int = input[0]
    for(i in 0 .. input.size-1)
        if(input[i] < min)
            min = input[i]

    return min

}