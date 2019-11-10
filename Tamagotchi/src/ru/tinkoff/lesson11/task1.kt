package ru.tinkoff.lesson11

fun main()
{
    val inPutStr = readLine()

    if( inPutStr !is String )
    {
        println("Введена некорректная строка")
        return
    }

    val stackOfSymbols = ArrayList<Char>()
    val stackOfIds = ArrayList<Int>()

    for( i in 0 .. inPutStr.length - 1 )
    {

        if( inPutStr[i] == '(' ||
            inPutStr[i] == '{' ||
            inPutStr[i] == '[' )
        {
            stackOfSymbols.add( inPutStr[i] )
            stackOfIds.add( i + 1 )
        }
        else
        {
            when( inPutStr[i] )
            {
                ')' ->
                    if( stackOfSymbols.isNotEmpty() && stackOfSymbols.last() == '(' ) {
                    stackOfSymbols.removeAt(stackOfSymbols.lastIndex)
                    stackOfIds.removeAt(stackOfIds.lastIndex)
                    }
                    else
                    {
                        println(i + 1)
                        return
                    }
                '}' ->
                    if( stackOfSymbols.isNotEmpty() && stackOfSymbols.last() == '{' ) {
                        stackOfSymbols.removeAt(stackOfSymbols.lastIndex)
                        stackOfIds.removeAt(stackOfIds.lastIndex)
                    }
                    else
                    {
                        println(i + 1)
                        return
                    }
                ']' ->
                    if( stackOfSymbols.isNotEmpty() && stackOfSymbols.last() == '[' ) {
                        stackOfSymbols.removeAt(stackOfSymbols.lastIndex)
                        stackOfIds.removeAt(stackOfIds.lastIndex)
                    }
                    else
                    {
                        println(i + 1)
                        return
                    }
            }
        }
    }
    if( stackOfSymbols.isEmpty() )
        println("Success")
    else
        println( stackOfIds.last() )
}