fun main(args:Array<String>) {
    println(findIndexOfSubstring("HUST","666"))
}
fun findIndexOfSubstring(big:String, small:String):Int {
    if (big.isEmpty() || small.isEmpty() || small == null || big ==null)
        return -1
    if (big.length<small.length)
        return -1
    var smallLength = small.length
    var bigLength = big.length
    var countSame = 0
    var i = 0
    var j = 0
    while (i <= bigLength - smallLength)
    {
        while (j < smallLength && big[i+j] == small[j])
        {
            countSame++
            j++
        }
        i++
        if (countSame == smallLength)
            return i-1
    }
    return -1
}
