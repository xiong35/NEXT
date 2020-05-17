import java.io.File


fun main(){
    val content=File("/Users/liujiayi/UndefinedYet/group/DDLs/5-17.md").readLines()
    var startWrite:Boolean=false
    var contentToBeWrite:String=""
    for (line in content){
        if (line=="### 任务0") startWrite=true
        else if (line=="### 任务1") break
        else if (startWrite) contentToBeWrite+=line+'\n'
    }
    File("/Users/liujiayi/IdeaProjects/file_task0/file_task0_1.txt").writeText(contentToBeWrite)
}
