package xyl.5-5.task1

// interface
interface A {
    fun foo() { println("A") } // 已实现
    fun bar() // 未实现，没有方法体，是抽象的
}

interface B {
    fun foo() { println("B") } // 已实现
    fun bar() { println("bar") } // 已实现
}

class C : A {
    override fun bar() { println("bar") } // 重写
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

// genericity



fun main(args: Array<String>) {
    val d = D()
    d.foo()
    d.bar()
}

