package org.events

import org.entities.Task

// An Event. Also the Parent Class to all the future ones
open class Event (
    var title: String, 
    var description: String, 
    var date: String, 
    var time: String, 
    var address: String) {
    var tasks = mutableListOf<Task>()

    // Function to add a task to the tasks list. No return variable
    fun addTask(task: Task) {
        tasks.add(task)
    }

    // Function to return the entire list of tasks
    fun getTasks(): List<Task> {
        return tasks
    }

    // Function to return the basic event details as a string list
    fun getDetails(): List<String> {
        val details = mutableListOf(title, description, date, time, address)
        return details
    }

    fun displayEventDetails() {
        println("Event: $_title")
        if (tasks.isEmpty()) {
            println("No tasks added yet.")
        } else {
            println("Tasks:")
            tasks.forEach { println(it) }
        }
    }

}