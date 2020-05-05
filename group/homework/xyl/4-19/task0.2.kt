fun main(args: Array<String>) {
    var input = readLine()?.toInt() ?: 0
    println("sum with loop: ${sumWithLoop(input)}")
    println("sum with rec: ${sumWithRecurent(input)}")
    println(indexOf("foobar", "bar"))
}

fun sumWithLoop(input: Int): Int {
    var sum = 0
    for (i in 1..input) {
        sum += i
    }
    return sum
}

fun sumWithRecurent(input: Int, sum: Int = 0): Int {
    return if (input == 0) {
        sum
    } else {
        sumWithRecurent(input - 1, sum + input)
    }
}

fun indexOf(target: String, sub: String): Int {
    var tarInd = -1
    outter@ while (target.length - sub.length - tarInd >= 0) {
        tarInd++
        var subInd = 0
        while (subInd < sub.length) {
            if (target[tarInd + subInd] != sub[subInd]) {
                continue@outter
            }
            subInd++
        }
        return tarInd
    }
    return -1
}
