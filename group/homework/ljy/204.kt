//class Solution {
//
//}
//fun countPrimes(n: Int): Int {
//    if (n<=2) return 0
//    var list = mutableListOf<Int>()
//    for (i in 2..n-1){
//        list.add(i)
//    }
//    var point:Int=0
//    while (point<Math.sqrt(n.toDouble())+1){
//        var point2:Int=list.size-1
//        while (point2>point*point-1){
//            if (list[point2]%list[point]==0) list.removeAt(point2)
//            point2--
//        }
//        point++
//    }
//    return list.size
//}
fun arrInit():(Int)->Int={1}
fun countPrimes(n: Int): Int {
    if (n<=2) return 0
    var arr= Array<Int>(n,arrInit())
    arr[0]=0
    arr[1]=0
    var point:Int=2
    while (point<Math.sqrt(n.toDouble())+1){
        var point2:Int=point*point
        while (point2<n){
            arr[point2]=0
            point2+=point
        }
        point++
    }
    var num:Int=0
    for (i in 0..n-1){
        if (arr[i]==1) num++
    }
    return num
}
fun main(){
    println(countPrimes(100))
}
