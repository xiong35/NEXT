// 1. 定义一个 Person 类, 这个类有 age 属性、getAge 方法
// 1. age 的**默认值是 18**, 也可在实例化的时候指定, **age是私有属性, 不可直接获取**
// 2. getAge 方法是共有方法, 效果是打印 "I'm \<age\> year's old", \<age\> 用上述 age 属性的值替换
// 2. 定义 Coder 类, 他**继承**自 Person 类
// 3. **重载** Coder 类的 getAge 方法, 现在调用这个方法会打印 
// "I seem to be \<age + 10\> years old, but actually I'm \<age\>!"

fun main(args: Array<String>) {
    var xylAtHighSchool = Person()
    xylAtHighSchool.getAge()
    var xyl = Coder(age = 19)
    xyl.getAge()
}

open class Person(age: Int = 18) {
    protected var age = age
    open fun getAge(){
        println("I'm $age year's old")
    }
}

class Coder(age: Int = 18): Person(age){
    override fun getAge(){
        println("I seem to be ${age + 10} years old, but actually I'm $age!")
    }
}