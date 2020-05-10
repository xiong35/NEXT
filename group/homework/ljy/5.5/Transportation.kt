enum class Type{
    Car,Bike,Lorry,Plane
}
interface Transportation{
    var type:Type
    var owner:String
    var ID:Int
    fun Start(){
        println(owner+"'s "+type+" start")
    }
    fun Way()
}
class Car:Transportation{
    override var type:Type=Type.Car
    override var owner:String="jaya"
    override var ID:Int=1
    override fun Way(){
        println("_________")
    }
}

fun main(){
    var vehicle:Car=Car()
    vehicle.Start()
    vehicle.Way()
}