package classes

// This is where the main program runs for the Event Planner
class Program() {

    // Input loop for Event Planner
    fun run() {
        println("")
        println("------")
        println("Event Planner")
        println("------")
        while (true) {
            print("Enter option (enter \"exit\" to leave): ")
            var response :String? = readLine()!!
            if (response == "exit") {
                println("Have a nice day!")
                break
            }
            println(response)

        }
    }
}