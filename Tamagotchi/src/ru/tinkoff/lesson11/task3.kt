package ru.tinkoff.lesson11

class Pack( val arrival: Int, val duration: Int )
{
    var finishTime = -1
}

fun main()
{
    var bufferSize = scan.nextInt()
    val numb = scan.nextInt()
    if( numb == 0 )
        return

    val packs = ArrayList<Pack>()
    for( i in 1..numb )
        packs.add(Pack(scan.nextInt(), scan.nextInt()))

    val output = ArrayList<Int>()
    var time = -1
    val queue = ArrayList<Pack>()
    var queueFinishTime = 0
    for( pack in packs )
    {
        if( pack.arrival > time )
            time++

        if( !queue.isEmpty() ) {
            for (i in 0..queue.size - 1) {
                if (queue[i].finishTime <= time && queue[i].finishTime != -1)
                    queue.removeAt(i)
            }
        }
        if( queue.size < bufferSize )
        {
            queue.add(pack)
            output.add(maxOf(queueFinishTime, pack.arrival))
            queueFinishTime += pack.duration
            pack.finishTime = queueFinishTime
        }
        else
            output.add(-1)
    }
    for( timeFinish in output)
        println(timeFinish)
}