fun main(){
    var a=3
    var x=null
    // let:调用let的对象为函数的参数。
    // 在函数块内可以通过 it 指代该对象。
    // 返回值为函数块的最后一行或指定return表达式。
    val y=x?.let {//不执行
        println("y=x")
        it
    }
    val b=a.let {
        println("b=2*a")
        a*2
    }
    println("b:"+b)
    // with:with函数和前面的几个函数使用方式略有不同，因为它不是以扩展的形式存在的。
    // 它是将某对象作为函数的参数，在函数块内可以通过 this 指代该对象。
    // 返回值为函数块的最后一行或指定return表达式。
    val result= with(arrayOf(1,2,3),{
        println("array.count():"+this.count())
        5
    })//this可省略
    println("result:"+result)
    // run函数实际上可以说是let和with两个函数的结合体，
    // run函数只接收一个lambda函数为参数，以闭包形式返回，
    // 返回值为最后一行的值或者指定的return的表达式。
    val result_2= arrayOf(1,2,3,4).run{
        println("array.count:"+this.count())
        22
    }
    println("result_2:"+result_2)
    //从结构上来看apply函数和run函数很像，唯一不同点就是它们各自返回的值不一样，
    // run函数是以闭包形式返回最后一行代码的值，而apply函数的返回的是传入对象的本身。
    val result_3= arrayOf(1,3,5,7,9).apply{
        println("array.count:"+this.count())
    }
    for (i in result_3){
        println(i)
    }
    // also函数的结构实际上和let很像唯一的区别就是返回值的不一样，
    // let是以闭包的形式返回，返回函数体内最后一行的值，如果最后一行为空就返回一个Unit类型的默认值。
    // 而also函数返回的则是传入对象的本身
    val result_4= arrayOf(2,4,6,8).also{
        println("array.count:"+it.count())
    }
    for (i in result_4){
        println(i)
    }
}
