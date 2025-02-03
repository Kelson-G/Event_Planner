package main.classes
import main.classes.display.Menu

// This is where the main program runs for the Event Planner
class Program() {

    val mainTitle: String = """
    -------------
    Event Planner
    -------------
    """

    val mainMenu: Menu = Menu(
        title = "MAIN MENU",
        options = mapOf(
            "1" to "View Templates",
            "2" to "View Events",
            "3" to "Option 3",
            "e" to "exit"
        )
    )

    val subMenuOne: Menu = Menu(
        title = "Templates",
        options = mapOf(
            "1" to "Template One",
            "2" to "Template Two",
            "3" to "Default",
            "e" to "back to menu"
        )
    )


    val subMenuTwo: Menu = Menu(
        title = "Events",
        options = mapOf(
            "1" to "Group Date",
            "2" to "FHE",
            "3" to "Birthday Party",
            "e" to "back to menu"
        )
    )

    // Input loop for Event Planner
    fun run() {
        println(mainTitle)

        // Application Loop
        while (true) {
            var option: String = mainMenu.Display()

            if (option == "1") {
                while (true) {
                    option = subMenuOne.Display()
                    if (option == "e") {
                        break
                    } else {
                        println(option)
                    }                
                }
            } else if (option == "2") {
                while (true) {
                    option = subMenuTwo.Display()
                    if (option == "e") {
                        break
                    } else {
                        println(option)
                    }                
                }
            } else if (option == "3") {
                createEvent()
            } else if (option == "e") {
                println("Exit Worked!!!!!!")
                println("Goodbye :)")
                break
            }
        }
    }

    fun createEvent() {
        println("This will eventually be used to create an event")
        println("Type anything to continue")
        var option: String = readLine()!!
    }
}