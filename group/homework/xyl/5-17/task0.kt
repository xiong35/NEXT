import java.io.File

fun main() {
    textIO()
    byteIO()
}

fun byteIO(){
    val rPath = "C:\\Users\\xiong35\\Desktop\\temp\\images\\maomao.jpg"
    val wPath = "C:\\Users\\xiong35\\Desktop\\workingspace\\大创\\group\\homework\\xyl\\5-17\\maomao.jpg"
    val img = File(rPath).readBytes()
    File(wPath).writeBytes(img)
}

fun textIO() {
    val rPath = "C:\\Users\\xiong35\\Desktop\\workingspace\\大创\\group\\DDLs\\5-17.md"
    val wPath = "C:\\Users\\xiong35\\Desktop\\workingspace\\大创\\group\\homework\\xyl\\5-17\\out.txt"
    var str = ""
    var lines = File(rPath).readLines()
    var flag = 0
    for (line in lines) {
        if (flag == 1 && line.startsWith("###")) {
            break
        }
        if (line.startsWith("### 任务0")) {
            flag = 1
        }
        if (flag == 1) {
            str += line + '\n'
        }
    }
    File(wPath).writeText(str)    
}
