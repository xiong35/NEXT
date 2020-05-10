interface Roamable{
    fun roam()
}

abstract class Animal : Roamable{
    abstract val image:String
    abstract val food:String
    abstract val habitat:String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    val sleep = { println("The animal is sleeping.")}//lambda
}

abstract class Canine : Animal(){
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine(){
    override val image: String
        get() = "wolf.jpg"
    override val food: String
        get() = "meat"
    override val habitat: String
        get() = "forests"

    override fun makeNoise() {
        println("Hooooow!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

class Vehicle : Roamable{
    override fun roam() {
        println("The Vehicle is roaming")
    }
}

class Box<T>(t:T){//Generics
    val value = t
}

fun main(args: Array<String>) {
    val a = run {
        println("running")
        return@run 3
    }
    println(a)
    val wolf = Wolf()
    wolf.sleep()
    val b = "String".also {
        println(it)
    }
    println(b)
    var box1 = Box("helloworld")
    println(box1.value)
}