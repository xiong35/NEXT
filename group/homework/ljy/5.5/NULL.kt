fun main(){
    //?:"?"加在变量名后，系统在任何情况不会报它的空指针异常
    //!!:"!!"加在变量名后，如果对象为null，那么系统一定会报异常
    var count:String?=null
//    var count_int=count!!.toInt()//为空时抛出异常
    var count_int_2=count?.toInt()//为空时返回null
    //对象A ?: 对象B 表达式，意思为，当对象 A值为 null 时，那么它就会返回后面的对象 B
    var count_int_3=count?.toInt()?:-1
    println("count_int_2:"+count_int_2)
    println("count_int_3:"+count_int_3)
}