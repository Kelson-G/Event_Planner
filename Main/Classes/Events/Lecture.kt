package classes.events

import classes.events.Event

class Lecture(var _speaker: String, var _topic: String) : Event(_title, _description, _date, _time, _address) {
    override fun getDetails(): List<String> {
        val details = mutableListOf(_title, _description, _date, _time, _address, _speaker, _topic)
        return details
    }
}