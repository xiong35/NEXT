import java.io.File

fun menu(path:String, layer:Int){
    val fileTree:FileTreeWalk=File(path).walk()
    fileTree.maxDepth(1).forEach {
        if (it.path!=path){
            var temp:Int=0
            while (temp<layer) {
                print("-")
                temp++
            }
            println(" "+it.name)
            if (!it.isFile) {
                menu(it.path, layer+1)
            }
        }
    }
}
fun main(){
    menu("/Users/liujiayi/UndefinedYet", 1)
}