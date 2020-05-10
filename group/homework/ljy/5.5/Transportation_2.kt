enum class Types{
    car,bike,lorry,plane
}
class MyTransportation<T>(t:T){
    var type=t
    fun start(){
        println("A "+type+" is on the way. ")
    }
}
fun main(args : Array<String>){
    var vehicle=MyTransportation<Types>(Types.car)
    vehicle.start()
}