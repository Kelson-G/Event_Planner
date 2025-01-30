//a title, a description of said task, time it should take, and a start/end time
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// Class to represent a Task
class Task(val description: String, val startTime: LocalDateTime, val endTime: LocalDateTime) {
    override fun toString(): String {
        return "Task: $description, Start: ${startTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))}, " +
                "End: ${endTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))}"
    }
}

// Class to represent an Event
class Event(val title: String) {
    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun displayEventDetails() {
        println("Event: $title")
        if (tasks.isEmpty()) {
            println("No tasks added yet.")
        } else {
            println("Tasks:")
            tasks.forEach { println(it) }
        }
    }
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)

    // Get event title
    print("Enter the event title: ")
    val eventTitle = scanner.nextLine()
    val event = Event(eventTitle)

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