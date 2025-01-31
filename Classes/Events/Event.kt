package main.classes.events

// An Event. Also the Parent Class to all the future ones
open class Event (
    var _title: String, 
    var _description: String, 
    var _date: String, 
    var _time: String, 
    var _address: String) {
    private var _tasks = mutableListOf<Task>()

    // Function to add a task to the tasks list. No return variable
    fun addTask(task: Task) {
        _tasks.add(task)
    }

    // Function to return the entire list of tasks
    fun getTasks(): List<Task> {
        return _tasks
    }

    // Function to return the basic event details as a string list
    fun getDetails(): List<String> {
        val details = mutableListOf(_title, _description, _date, _time, _address)
        return details
    }

}