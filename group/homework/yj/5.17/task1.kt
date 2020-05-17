fun main() {

    val string1 = """
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
        wwww.bilibili.com""".trimIndent()
    val target1 = "\\b\\w*?re\\b"
    Regex(target1).findAll(string1).forEach{
        println(it.value)
    }
    val target2 = Regex("\\bw{3}\\..*?\\.(com|cn)")
    target2.findAll(string1).forEach {
        println(it.value.replace(Regex("^w{3}\\."),"")
                .replace(Regex("\\.(com|cn)$"),""))
    }
    val target3 = """\b[a-z]*?([a-z])[a-z]\1\S*?\b"""
    val target33 = Regex("(\\w)\\w\\1")
    target33.findAll(string1).forEach {
        print(it.value)     //打印完整单词
        target33.findAll(it.value).forEach {
            print(it.value)     //打印aba部分
        }
    }
    val target4 = Regex("i\\w*?i")
    target4.findAll(string1).forEach {
        println(it.value)
    }
    val target5 = Regex("i\\w*i")
    target5.findAll(string1).forEach {
        println(it.value)
    }
}