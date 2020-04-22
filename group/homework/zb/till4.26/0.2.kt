tailrec fun add(num:Int, result: Int):Int{
    return if(num==0){
        println("结果是$result")
        0
    } else{
        add(num-1, result+num)
    }
}
fun main(args:Array<String>):Unit{
    println("请输入一个数字：")
    var num1 = readLine()
    var result = 0
    result = add(num1!!.toInt(),result)
}