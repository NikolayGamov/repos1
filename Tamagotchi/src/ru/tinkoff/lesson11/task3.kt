package ru.tinkoff.lesson11

fun main()
{
    val bufferSize = scan.nextInt()
    val numb = scan.nextInt()
    if( numb == 0 )
        return

    var inQueue = 0
    var delay = 0

    var processTime = 0



    for( i in 1..numb )
    {
        if( inQueue == bufferSize - 1 )
            println( -1 )
        else if( inQueue == 0 && processTime == 0)
        {
            println( scan.nextInt() )
            processTime = scan.nextInt()
        }
        else if( inQueue == 0 )
        {
            println( processTime + scan.nextInt() )
            delay += scan.nextInt()
        }
        else
        {
            println( processTime + delay )
            delay += scan.nextInt()
        }
        if( delay > 0 )
            --delay
    }
}