package classes.events

import classes.events.Event

class Wedding(var _couple: String) : Event(_title, _description, _date, _time, _address) {
    override fun getDetails(): List<String> {
        val details = mutableListOf(_title, _description, _date, _time, _address, _couple)
        return details
    }
}