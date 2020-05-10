fun main(args:Array<String>) {
    println("please input a number")
    var input = readLine()
    var nums = 1 ..input!!.toInt()
    var sum = 0
    for (num in nums){
       sum += num
    }
    println("the addfuction is $sum")
}


tailrec fun addfuction(input :Int, sum: Int): Int {
        return if(input ==0){
            println("the sum is $sum")
            return 0
        } else{
             addfuction(input -1, sum+input)
        }
    }

    fun main(args:Array<String>):Unit{
        println("please input a number")
        var input = readLine()
        var sum = 0
        sum = addfuction(input!!.toInt(),sum)
    }
fun index(string1:String,string2:String):Int{
     var i=0
     var j=0
     var num=0
     while (i <= string1.length - string2.length)
     {
         while (j < string2.length && string1[i+j] == string2[j])
         {
             num++
             j++
         }
         i++
         if (num == string2.length)
             return i-1
     }
     return -1
 }

fun main(args:Array<String>):{
    var string1 = readLine()
    var string2 = readLine()
    println(index(string1,string2))
}
