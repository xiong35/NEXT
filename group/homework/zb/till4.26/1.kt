open class Person( ageParameter:Int = 18){
    private val age = ageParameter
    open fun getAge(){
        println("I'm $age years old")
    }
}

class Coder(ageParameter: Int = 18) : Person(){
    private val age = ageParameter
    override fun getAge() {
        println("I seem to be ${age + 10} years old, but I'm ${age} years old.")
    }
}
