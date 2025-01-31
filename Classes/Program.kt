package classes
import display.Menu

// This is where the main program runs for the Event Planner
class Program() {

    val mainMenu: Menu = Menu(
        title = "MAIN MENU",
        options = mapOf(
            "0" to "Create Template",
            "1" to "My Templates",
            "2" to "View Events"
        )
    )

    // Input loop for Event Planner
    fun run() {
        println("")
        println("------")
        println("Event Planner")
        println("------")
        while (true) {
            var option: String = mainMenu.Display()
            println(option)
            // print("Enter option (enter \"exit\" to leave): ")
            // var response :String? = readLine()!!
            // if (response == "exit") {
            //     println("Have a nice day!")
            //     break
            // }
            // println(response)

        }
    }
}