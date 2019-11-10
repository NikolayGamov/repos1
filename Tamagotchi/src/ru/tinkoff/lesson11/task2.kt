package ru.tinkoff.lesson11

import java.util.*
import kotlin.collections.ArrayList

val scan = Scanner(System.`in`)

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
    val number = scan.nextInt()

    val nodes = ArrayList<Int>()
    for( i in 1 .. number )
    {
        val newNode = scan.nextInt()
        nodes.add( newNode )
    }

    val root = FindRoot( nodes )
    println( CalcHeightOfSubTree(root, nodes) )
}