package ru.tinkoff.lesson11

fun CalcHeightOfSubTree(vertex: Int, subTree: ArrayList<Int>): Int
{
    var height = 1
    for( i in 0 .. subTree.size - 1 )
    {
        if( subTree[i] == vertex )
        {
            height = maxOf( height, 1 + CalcHeightOfSubTree(i, subTree) )
        }
    }
    return height
}

fun FindRoot( tree: ArrayList<Int> ): Int
{
    var root = 0
    for( i in 0 .. tree.size - 1 )
    {
        if( tree[i] == -1 )
        {
            root = i
        }
    }
    return root
}

fun main()
{
    val number = readLine()

    if( number !is String )
    {
        println("Введена некорректная строка")
        return
    }

    val nodes = ArrayList<Int>()
    for( i in 1 .. number.toInt() )
    {
        val newNode = readLine()
        if( newNode is String )
        {
            nodes.add( newNode.toInt() )
        }
    }

    val root = FindRoot( nodes )

    var heightOfTree = CalcHeightOfSubTree(root, nodes)



    println( heightOfTree )
}