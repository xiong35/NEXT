fun main() {

    /*测试文本*/
    val testString = """
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

    /*以re结尾*/println("以re结尾：")
    val regex1 = "\\b\\w*?re\\b"
    Regex(regex1).findAll(testString).forEach{
        println(it.value)
    }

    /*以"www."开头且以".com"或者".cn"结尾*/println("以\"www.\"开头且以\".com\"或者\".cn\"结尾")
    val regex2 = Regex("\\bw{3}\\..*?\\.(com|cn)")
    regex2.findAll(testString).forEach {
        println(it.value.replace(Regex("^w{3}\\."),"")   //除去www.
            .replace(Regex("\\.(com|cn)$"),""))         //除去.com .cn
    }

    /*包含aba式*/println("包含aba式")
    val regex3Full = Regex("\\b\\w*?(\\w+)(\\w+)\\1\\w*?\\b")
    val regex3Part = Regex("(\\w+)(\\w+)\\1")
    regex3Full.findAll(testString).forEach {
        print(it.value)     //打印完整单词
        print("\t\t重复字符为：")
        regex3Part.findAll(it.value).forEach {
            print(it.value)     //打印aba部分
            print(";")
        }
        print("\n")
    }

    /*非贪婪地  两个字母i及之间的部分*/println("两个字母i及之间的部分（非贪婪）：")
    val regex4 = Regex("i\\w*?i")
    regex4.findAll(testString).forEach {
        println(it.value)
    }

    /*贪婪地  两个字母i及之间的部分*/println("两个字母i及之间的部分（贪婪）：")
    val regex5 = Regex("i\\w*i")
    regex5.findAll(testString).forEach {
        println(it.value)
    }

}