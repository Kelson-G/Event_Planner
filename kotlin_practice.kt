/* This is how you comment code 
with multiple lines */
// This also works. If you highlight code and press Ctrl + / then it will comment all the highlighted lines
fun main() {
    println(fib(5))
}


fun fib(count: Int): Int {
    var previous = 0
    var running = 1
    if (count == 1) {
        return 0
    } else if (count == 2) {
        return 1
    } else {
        for (i in 2 until count) {
            val holder = running
            running += previous
            previous = holder
        }
        return running
    }
} 