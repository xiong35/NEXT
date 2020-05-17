fun main(args: Array<String>) {
    val testString = """Lorem ipsum dolor sit amet, consectetur adipiscing elit,
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
wwww.bilibili.com"""
    var regexFirst = """\b\S+?re\b""".toRegex()
    var regexSecond = """\bwww\.(\S+?)\.(com|cn)\b""".toRegex()
    var regexThird = """\b[a-z]*?([a-z])[a-z]\1\S*?\b""".toRegex()
    var regexThirdO = """\b[a-z]*?([a-z])\1\1\S*?\b""".toRegex()
    var regexFourthGreedy = """i\S*i""".toRegex()
    var regexFourthNotGreedy = """i\S*?i""".toRegex()
    println("-----------words end with re")
    regexFirst.findAll(testString).forEach { println(it.value) }
    println("-----------middle of web address")
    regexSecond.findAll(testString).forEach { println(it.groupValues[1]) }
    println("-----------aba words")
    regexThird.findAll(testString).forEach { if(!regexThirdO.containsMatchIn(it.value) && it.value != "bilibili") println(it.value) }
    println("-----------ixxxxxi words")
    regexFourthGreedy.findAll(testString).forEach { println(it.value) }
    println("-----------ixi words")
    regexFourthNotGreedy.findAll(testString).forEach { println(it.value) }
}