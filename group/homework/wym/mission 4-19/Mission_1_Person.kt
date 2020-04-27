open class Person (internal var age:Int = 18){
    open fun getAge(){
        println("I'm $age years old")
    }
}