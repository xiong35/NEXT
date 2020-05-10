class Solution {
    fun numJewelsInStones(J: String, S: String): Int {
        val charSet = J.toHashSet()
        var cnt = 0
        for (char in S){
            if (charSet.contains(char))
                cnt++
        }
        return cnt
    }
}