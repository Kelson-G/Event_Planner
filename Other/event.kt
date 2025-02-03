// An Event. Also the Parent Class to all the future ones
open class Event (
    var _title: String, 
    var _description: String, 
    var _date: String, 
    var _time: String, 
    var _address: String) {
    private var _tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        _tasks.add(task)
    }

    fun getTasks(): List<Task> {
        return _tasks
    }

    fun getDetails(): List<String> {
        val details = mutableListOf(_title, _description, _date, _time, _address)
        return details
    }

}