import java.io.File

fun main(){
    val content=File("/Users/liujiayi/Desktop/xx.jpg").readBytes()
    File("/Users/liujiayi/IdeaProjects/file_task0/xx.jpg").writeBytes(content)
}