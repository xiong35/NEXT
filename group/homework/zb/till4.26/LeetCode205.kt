import kotlin.math.pow
class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        var arrayS = IntArray(128)
        var arrayT = IntArray(128)
        for (i in s.indices)
        {
            val charSInt = s[i].toInt()
            val charTInt = t[i].toInt()
            if (arrayS[charSInt] == 0 && !arrayS.contains(charTInt))
                arrayS[charSInt] = charTInt
            else{
                if (arrayS[charSInt] != charTInt)
                    return false
            }
        }
        return true
    }
}