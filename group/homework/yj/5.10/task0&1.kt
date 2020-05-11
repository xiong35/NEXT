abstract class leagueoflegends{
    fun describe(){
        println{"Here are so many legends"}
    }
}

interface vampire{
    fun w(){
        println("use w to avoid control")
    }
}

class injury{
    var e:Int?=null
    var q:Int?=null
    fun countinjury(){
        val sum:(Int,Int) -> Int = {e,q -. e+q}// lambda
    }
}

override fun w(){
    println("use w to keep your life")
}

fun main(args:Array<String>){
    var game=injury("high")
    game.e=999
    game.q=1000
    game.countinjury()
    println("the total injury is ${game.countinjury}")
}