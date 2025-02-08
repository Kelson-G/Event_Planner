package org.main

// Import Classes
import org.display.Menu
import org.entities.Task
import org.events.Event
import org.events.FHE
import org.events.Lecture
import org.events.Wedding

// Import Modules
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// This is where the main program runs for the Event Planner
class Program() {

    // Menu
    val mainTitle: String = """
    -------------
    Event Planner
    -------------
    """

    val mainMenu: Menu = Menu(
        title = "MAIN MENU",
        options = mapOf(
            "1" to "Create Event",
            "2" to "View Events",
            "e" to "exit"
        )
    )

    // Events List
    val savedEvents = mutableListOf<Event>()

    // Input loop for Event Planner
    fun run() {
        println(mainTitle)

        // Application Loop
        while (true) {
            var option: String = mainMenu.Display()

            if (option == "1") {
                savedEvents.add(createEvent())
            } else if (option == "2") {
                if (savedEvents.isEmpty()) {
                    println("No events have been created yet")
                } else {
                    for (event in savedEvents) {
                        event.displayEventDetails()
                    }
                }
            } else if (option == "e") {
                println("Exit Worked!!!!!!")
                println("Goodbye :)")
                break
            }
        }
    }

    //Luke Hill
    fun createEvent(): Event {
        val scanner = java.util.Scanner(System.`in`)
        val event: Event // Declare here to use later
    
        // Choose event
        print("Select an event type (0 = Normal Event, 1 = FHE, 2 = Lecture, 3 = Wedding): ")
        val eventSelection = scanner.nextLine()
    
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
        event = when (eventSelection) {
            "0" -> Event(eventTitle, eventDescription, eventDate, eventTime, eventAddress)
            "1" -> FHE(eventTitle, eventDescription, eventDate, eventTime, eventAddress)
            "2" -> {
                print("Enter the speaker name: ")
                val eventSpeaker = scanner.nextLine()
                print("Enter the lecture topic: ")
                val eventTopic = scanner.nextLine()
                Lecture(eventSpeaker, eventTopic, eventTitle, eventDescription, eventDate, eventTime, eventAddress)
            }
            "3" -> {
                print("Enter the couple's names: ")
                val eventCouple = scanner.nextLine()
                Wedding(eventCouple, eventTitle, eventDescription, eventDate, eventTime, eventAddress)
            }
            else -> throw IllegalArgumentException("Invalid event type")


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

        return event
    }
}