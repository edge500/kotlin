// MODULE: lib
// FILE: A.kt
private var name: String = "John"
private fun greet(name: String): Unit = println("Hello, $name")

internal class A {
    inline fun inlineFunction() {
        greet(name)
        name = "Mary"
        greet(name)
    }
}

// MODULE: main()(lib)
// FILE: main.kt
fun box(): String {
    A().inlineFunction()
    return "OK"
}
