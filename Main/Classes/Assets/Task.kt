package main.classes.assets

//a title, a description of said task, time it should take, and a start/end time
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
// import Classes.Events.Event

// Class to represent a Task
class Task(val description: String, val startTime: LocalDateTime, val endTime: LocalDateTime) {
    override fun toString(): String {
        return "Task: $description, Start: ${startTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))}, " +
                "End: ${endTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))}"
    }
}

// Class to represent an Event
// class Event(val title: String) {
//     private val tasks = mutableListOf<Task>()

//     fun addTask(task: Task) {
//         tasks.add(task)
//     }

//     fun displayEventDetails() {
//         println("Event: $title")
//         if (tasks.isEmpty()) {
//             println("No tasks added yet.")
//         } else {
//             println("Tasks:")
//             tasks.forEach { println(it) }
//         }
//     }
// }