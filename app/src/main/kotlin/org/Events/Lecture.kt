package org.events

import org.events.Event

class Lecture(
    var _speaker: String, 
    var _topic: String
    title: String,
    description: String,
    date: String,
    time: String,
    address: String) : Event(title, description, date, time, address) {
    override fun getDetails(): List<String> {
        val details = mutableListOf(title, description, date, time, address, speaker, topic)
        return details
    }
}