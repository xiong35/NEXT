import java.io.File

fun getFileContentList(filename: String) : List<String>{
    val f = File(filename)
    return f.readLines()
}

fun writeFile(content : String, destfile: String){
    val f = File(destfile)
    if (!f.exists())
    {
        f.createNewFile()
    }
    f.writeText(content, charset("UTF-8"))
}

fun getBinaryFileContent(filename: String) : ByteArray{
    val f = File(filename)
    return f.readBytes()
}

fun writeBytesToNewFile(array : ByteArray, destfile: String){
    val f = File(destfile)
    if (!f.exists())
        f.createNewFile()
    f.writeBytes(array)
}

fun getFileTree(filename: String) : FileTreeWalk{
    val f = File(filename)
    return f.walk()
}

fun printFile(file : File, level: Int){
    if (file.name != "NEXT")
    {
        for (a in 0..level)
            result += "-"
        result += " ${file.name}\n"
    }
    if (file.isDirectory){
        val fileTmp = file.listFiles()
        for (a in fileTmp)
            printFile(a, level+1)
    }
}

var result = ""
fun main(args: Array<String>) {
    val contentList = getFileContentList("""C:\Users\12421\NEXT\group\DDLs\5-17.md""")
    var content : String = ""
    for (a in 15 .. 29)
        content += contentList[a] + '\n'
    writeFile(content, """C:\Users\12421\NEXT\group\homework\zb\5.17\task0.txt""")
    val byteArray = getBinaryFileContent("""C:\Users\12421\NEXT\group\homework\zb\5.17\picture.jpg""")
    writeBytesToNewFile(byteArray, """C:\Users\12421\NEXT\group\homework\zb\5.17\newpicture.jpg""")
//    val filetree = getFileTree("""C:\Users\12421\NEXT\""")
    val fileTmp = File("""C:\Users\12421\NEXT\""")
    printFile(fileTmp, -1)
    writeFile(result, """C:\Users\12421\NEXT\group\homework\zb\5.17\directoryStructure.txt""")
}