import java.util.*

val scan = Scanner(System.`in`)
fun main(args: Array<String>)
{
    val s = scan.next()
    print(isCapitalized(s))
}

fun isCapitalized(s: String): Boolean
{
    if(s[0].isUpperCase())
        return true
    return false
}