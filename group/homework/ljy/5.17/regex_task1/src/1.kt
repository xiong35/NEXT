import  java.io.File

fun main(){
    val text="""
        Lorem ipsum dolor sit amet, consectetur adipiscing elit,
        sed do eiusmod tempor incididunt ut labore et dolore magna
        aliqua. Ut enim ad minim veniam, quis nostrud exercitation
        ullamco laboris nisi ut aliquip ex ea commodo consequat.
        Duis aute irure dolor in reprehenderit in voluptate velit
        esse cillum dolore eu fugiat nulla pariatur. Excepteur sint
        occaecat cupidatat non proident, sunt in culpa qui officia
        deserunt mollit anim id est laborum.
        www.demo.org
        www.baidu.com
        www.foobar.cn
        wwww.bilibili.com
    """.trimIndent()

    var patt1=Regex("""\b\w*re\b""")
    var match_1=patt1.findAll(text)
    println("---re:")
    match_1.forEach {
        println(it.value)
    }
    println()

    var patt2=Regex("""\bwww.(\w*)(.com|.cn)\b""")
    var match_2=patt2.findAll(text)
    println("www.----.com/cn:")
    match_2.forEach {
        println(it.groupValues[1])
    }
    println()

    var patt3=Regex("""\b[a-z]*([a-z])[a-z]\1[a-z]*\b""")
    var match_3=patt3.findAll(text)
    println("--aba--")
    match_3.forEach {
        println(it.value)
    }
    println()

    println("---i-i---")
    var patt4=Regex("""[a-z]*i([a-z]*)i[a-z]*""")
    var match_4=patt4.findAll(text)
    match_4.forEach {
        println(it.groupValues[1])
    }
    println()

    println("--i----i--")
    var patt5=Regex("""[a-z]*?i([a-z]*)i[a-z]*""")
    var match_5=patt5.findAll(text)
    match_5.forEach {
        println(it.groupValues[1])
    }
    println()
}