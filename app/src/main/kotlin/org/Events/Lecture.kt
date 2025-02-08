package org.events

import org.events.Event

class Lecture(
    var speaker: String, 
    var topic: String,
    title: String,
    description: String,
    date: String,
    time: String,
    address: String) : Event(title, description, date, time, address) {
    fun getLectureDetails(): List<String> {
        val details = mutableListOf(title, description, date, time, address, speaker, topic)
        return details
    }
}