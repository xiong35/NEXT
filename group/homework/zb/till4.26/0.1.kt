fun main(args:Array<String>) {
    println("请输入一个数字：")
    var num1 = readLine()
    var nums = 1 ..num1!!.toInt()
    var result = 0
    for (num in nums){
        result += num
    }
    println("结果为$result")
}