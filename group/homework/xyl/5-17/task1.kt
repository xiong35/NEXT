import java.io.File

fun main() {
    val target = """
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

    endWith(target, "re")
    findWeb(target)
    findABA(target)
    findBetween(target, "greedy")
    findBetween(target, "non greedy")
}

fun endWith(target: String, pattern: String) {
    println("---re---")
    val r = Regex("\\b\\w*${pattern}\\b")
    r.findAll(target).forEach {
        println(it.groupValues[0])
    }
}

fun findWeb(target: String) {
    println("---www.foo.com---")
    val r = Regex("www\\.(\\w+)\\.(cn|com)")
    r.findAll(target).forEach {
        println(it.groupValues[1])
    }
}

fun findABA(target: String) {
    println("---aba---")
    val r = Regex("\\b\\w*(\\w)\\w\\1\\w*\\b")
    r.findAll(target).forEach {
        println(it.groupValues[0])
    }
}

fun findBetween(target: String, mode: String) {
    println("---i*i---")
    val r: Regex = if (mode == "greedy") {
        Regex("""\b\w*?i(\w*)i\w*\b""")
    } else {
        Regex("""\b\w*i(\w+?)i\w*\b""")
    }
    r.findAll(target).forEach {
        println(it.groupValues[1])
    }
}