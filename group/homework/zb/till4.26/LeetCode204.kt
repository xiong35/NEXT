import kotlin.math.sqrt
class Solution {
    fun countPrimes(n: Int): Int {
        if(n <= 2)
            return 0
        var count = 0
        var primeArray = Array(n + 1) {1}
        for (i in 2 until n)
        {
            if (primeArray[i] == 1)
                count++
            var tmp:Long = i * i.toLong()
            if (tmp < n)
            {
                for (j in tmp until n step i.toLong())
                {
                    if (primeArray[j.toInt()] == 1)
                        primeArray[j.toInt()] = 0
                }
            }
        }
        return count
    }
}