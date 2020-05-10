/*定义学校类*/
abstract class School{

    fun declare(){
        println("这里是一所好学校")
    }

}

/*定义老师接口*/
interface Teacher{

    fun show(){
        println("有很多老师")
    }

}

/*定义学生接口*/
interface Student{

    fun show(){
        println("有很多学生")
    }

    fun giveVacation()
    //放假方法
}

/*定义大学类*/
class University(var name: String): School(), Teacher, Student{

    var numOfTeacher: Int? = null   //教师人数
    var numOfStudent: Int? = null   //学生人数

    fun countPeople(){
        val sumUp: (Int, Int) -> Int = {a, b -> a + b}
        println("${name}一共有${sumUp(numOfTeacher?:0,numOfStudent?:0)}人")  //为空则按0算  //?:
    }   //统计师生人数

    fun callName(){
        println("它的名字叫${name}")
    }   //展示名字

    override fun show(){
        print(name)
        super<Teacher>.show()
        print(name)
        super<Student>.show()
    }   //重写show方法

    fun <T> showBuilding(classroom: T, dorm: T){
        if (dorm is String)
            println("这里有${classroom}，${dorm}")
        else if(dorm is Int)
            println("这里有${classroom}间教室，${dorm}栋宿舍")
    }   //字符串则直接引用，整数则补全描述

    override fun giveVacation() {
        println("||\n${name}的学生放假了")
    }   //重写放假方法

}

fun main(args: Array<String>) {

    var hust = University("Hust")
    hust.declare()                                      //这里是一所好学校
    hust.callName()                                     //它的名字叫Hust
    hust.numOfStudent = 100000
    hust.numOfTeacher = 10000
    hust.countPeople()                                  //Hust一共有110000人
    hust.showBuilding(100,200)           //这里有100间教室，200栋宿舍
    hust.run {
        val name = "李元元"
        println("其现任校长的名字叫${name}")                //其现任校长的名字叫李元元
    }
    hust.also{
        print("这里有${it.numOfTeacher}名最好的老师，")     //这里有10000名最好的老师，
    }.also {
        print("这里有${it.numOfStudent}名最好的学生，")     //这里有100000名最好的学生，
    }.also {
        val name = "计算机"
        println("还有很棒的${name}学院")                   //还有很棒的计算机学院
    }
    hust.giveVacation()                                 //Hust的学生放假了

}