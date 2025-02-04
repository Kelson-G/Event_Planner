package main.classes
import main.classes.display.Menu
// import main.classes.entities.Task
import main.classes.events.Event

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

    //Luke Hill
    fun createEvent() {
        val scanner = java.util.Scanner(System.`in`)

        // Get event title
        print("Enter the event title: ")
        val eventTitle = scanner.nextLine()

        // Get description
        print("Enter the description: ")
        val eventDescription = scanner.nextLine()

        // Get date
        print("Enter the date: ")
        val eventDate = scanner.nextLine()

        // Get time
        print("Enter the event's time: ")
        val eventTime = scanner.nextLine()

        // Get address
        print("Enter the address for the event: ")
        val eventAddress = scanner.nextLine()

        // Create Event
        val event = Event(eventTitle, eventDescription, eventDate, eventTime, eventAddress)

        // Get number of tasks
        print("Enter the number of tasks: ")
        val taskCount = scanner.nextInt()
        scanner.nextLine() // Consume newline

        // Get task details
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        for (i in 1..taskCount) {
            print("Enter description for task $i: ")
            val description = scanner.nextLine()
            print("Enter start time for task $i (yyyy-MM-dd HH:mm): ")
            val startTime = LocalDateTime.parse(scanner.nextLine(), formatter)
            print("Enter end time for task $i (yyyy-MM-dd HH:mm): ")
            val endTime = LocalDateTime.parse(scanner.nextLine(), formatter)

            event.addTask(Task(description, startTime, endTime))
        }

        // Display event details
        println("\nEvent Details:")
        event.displayEventDetails()
    }


}