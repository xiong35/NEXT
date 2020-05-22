import java.io.File

fun traverseFileTree(filename: String){
    val f = File(filename)
    val fileTreeWalk = f.walk()
    fileTreeWalk.iterator().forEach{
        val count = it.path.count{it == '\\'}  //统计路径中'\'出现次数
        for(i in 1..count){
            print("-")
        }
        print(" ")
        println(it.name)
    }
}

fun main() {
    /* 0-1 */
    val oldFile1 = File(".\\files\\5-17.md")
    val content1 = oldFile1.readLines() //读
    val newFile1 = File(".\\files\\output1.txt")
    for (i in 14..47) {
        newFile1.appendText(content1[i])    //写
        newFile1.appendText("\n")
    }
    /* 0-2 */
    val oldFile2 = File(".\\files\\image1.jpg")
    val content2 = oldFile2.readBytes() //读
    val newFile2 = File(".\\files\\output2.jpg")
    newFile2.writeBytes(content2)   //写
    /* 0-3 */
    traverseFileTree(".\\.\\.\\.\\")
}