package main.classes
import main.classes.display.Menu

// This is where the main program runs for the Event Planner
class Program() {

    val mainMenu: Menu = Menu(
        title = "MAIN MENU",
        options = mapOf(
            "0" to "Create Template",
            "1" to "My Templates",
            "2" to "View Events",
            "3" to "exit"
        )
    )

    // Input loop for Event Planner
    fun run() {
        println("")
        println("------")
        println("Event Planner")
        println("------")

        var option: String = mainMenu.Display()
        println(option)


    
    }
}