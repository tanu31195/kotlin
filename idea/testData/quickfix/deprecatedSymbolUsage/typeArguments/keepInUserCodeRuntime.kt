// "Replace with 'newFun(p)'" "true"

@Deprecated("", ReplaceWith("newFun(p)"))
fun oldFun(p: List<String>) {
    newFun(p)
}

fun newFun(p: List<String>){}

fun foo() {
    <caret>oldFun(listOf<String>("a"))
}
