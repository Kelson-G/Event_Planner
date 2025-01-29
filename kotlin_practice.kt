/* This is how you comment code 
with multiple lines */
// This also works. If you highlight code and press Ctrl + / then it will comment all the highlighted lines
fun main() {
    println(fib(7))
    val birthday = Event()
    birthday.date = "01/29/2025"
    birthday.time = "12pm"
    birthday.rsvp = true
    birthday.dress = "Casual"
    
    println(birthday.payment(1.toDouble(),0.05))
}


fun fib(count: Int): Int {
    var previous = 0
    var running = 1
    var holder = 0
    if (count == 1) {
        return 0
    } else if (count == 2) {
        return 1
    } else {
        for (i in 2 until count) {
            holder = running
            running += previous
            previous = holder
        }
        return running
    }
} 

class Event {
    var date = ""
    var time = ""
    var rsvp = true 
    var dress = ""
    fun payment(cost: Double,tax: Double): Double {
        return (cost + (cost * tax))
    }

}
