class Coder(age: Int = 18): Person(age) {
    override fun getAge(){
        println("I'm ${age+10} years old, but actually I'm $age!")
    }
}