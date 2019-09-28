fun sort(arr: IntArray)
{
    for(i in 0..arr.size-1)
    {
        for (j in i + 0..arr.size-1)
            if (arr[j] < arr[i])
            {
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
    }

}