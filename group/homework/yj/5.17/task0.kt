import java.io.File
fun getFile(filename: String) : List<String>{
    val f = File(filename)
    return f.readLines()
}
fun write(content : String, destfile: String){
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
        val file5 = file.listFiles()
        for (a in file5)
            printFile(a, level+1)
    }
}
var result = ""
fun main(args: Array<String>) {
    val contentList = getFile("""C:\Users\26752\NEXT\group\DDLs\5-17.md""")
    var content : String = ""
    for (a in 15 .. 29)
        content += contentList[a] + '\n'
    val byteArray = getBinaryFileContent("""C:\Users\26752\NEXT\group\homework\yj\5.17\kamenrider.jpg""")
    val fileTmp = File("""C:\Users\26752\NEXT\""")
    printFile(fileTmp, -1)
    write(result, """C:\Users\26752\NEXT\group\homework\yj\5.17\task.txt""")
}