class Solution {
    fun uncommonFromSentences(A: String, B: String): Array<String> {
        var stringMap = hashMapOf<String, Int>()
        var stringList = A.split(' ') + B.split(' ')
        for (a in stringList)
            stringMap[a] = (stringMap[a] ?: 0) + 1//!!!!!!!!!
        var result = mutableListOf<String>()
        for (key in stringMap.keys)
        {
            if (stringMap[key] == 1)
                result.add(key)
        }
        return result.toTypedArray()
    }
}