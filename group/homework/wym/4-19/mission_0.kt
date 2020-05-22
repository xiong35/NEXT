/* 任务0-2-i */
fun addNumByLoop(n: Int): Int? {
    if (n <= 0) {
        print("wrong input")
        return null
    }    //检查输入
    var result = 0
    var accumulator = 1    //累加器
    while(accumulator <= n){
        result += accumulator
        accumulator += 1
    }
    return result
}

/* 任务0-2-ii */
tailrec fun addNumByRecursion(n: Int, result: Int = 0): Int? {
    if (n <= 0) {
        print("wrong input")
        return null
    }    //检查输入
    if (n == 1) return result+1
    else return addNumByRecursion(n-1, result + n)
}

/* 任务0-2-iii */
fun findSubstring(longone: String, shortone: String): Int? {
    return longone.indexOf(shortone)
}