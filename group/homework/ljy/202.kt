fun isHappy(n: Int): Boolean {
    var slow:Int=n
    var fast:Int=n
    do {
        var new :Int=0
        while (slow!=0){
            new+=(slow%10)*(slow%10)
            slow/=10
        }
        slow=new
        new=0
        while (fast!=0){
            new+=(fast%10)*(fast%10)
            fast/=10
        }
        fast=new
        new=0
        while (fast!=0){
            new+=(fast%10)*(fast%10)
            fast/=10
        }
        fast=new
    }while (slow!=fast&&slow!=1)
    if (slow==1) return true
    return false
}
fun main(){
    var input:Int=Integer.valueOf(readLine())
    println(isHappy(input))
}