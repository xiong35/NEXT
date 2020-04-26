// 递归实现
fun Sum(n:Int):Int{
    if (n==1) return 1
    return n+Sum(n-1)
}

fun main(){
    println("请输入n：")
    var n:Int=Integer.valueOf(readLine())
    var sum:Int=0
    // 循环实现
    for (i in 1..n){
        sum+=i
    }
    println(sum)
    println(Sum(n))
}