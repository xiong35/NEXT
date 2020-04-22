import kotlin.math.pow
class Solution {
    fun isHappy(n:Int):Boolean{
        fun getNext(n: Int):Int{
            var totalSum = 0
            var nDevided = n
            while (nDevided > 0){
                totalSum += (nDevided % 10).toDouble().pow(2.0).toInt()
                nDevided /= 10
            }
            return totalSum
        }

        var hashSet = hashSetOf<Int>()
        var tmp = n
        while (tmp != 1 && !hashSet.contains(tmp))
        {
            hashSet.add(tmp)
            tmp = getNext(tmp)
        }
        return tmp == 1
    }
}