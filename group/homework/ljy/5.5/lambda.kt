fun main(){
    val sum={x:Int,y:Int->x+y;}//lambda的基本形式{ params -> expressions }
    val product:(x:Float,y:Float)->Float={x,y->x*y}//具体类型声明
    var a=0
    val ints= arrayOf(-1,0,1,2,3)
    ints.filter { it>0 }.forEach{//kotlin鼓励使用filter和forEach来替代常用的for循环和if条件判断
        a+=it// lambda表达式访问了它的作用域外部的变量，这个lambda表达式加上它访问的外部变量一起就构成了闭包
    }
//    for (i in ints){
//        if (i>0) a+=i;
//    }
    println("sum(1,2):"+sum(1,2))
    println("product(2.3f,3.2f):"+product(2.3f,3.2f))
    println("a:"+a)
}
