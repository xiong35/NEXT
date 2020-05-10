open class Person (internal var age:Int = 18){
    open fun getAge(){
        println("I'm $age years old")
    }
}
class Coder(age: Int = 18): Person(age) {
    override fun getAge(){
        println("I seem to be ${age+10} years old, but actually I'm $age!")
    }
}