package org.events

import org.events.Event

class Wedding(
    title: String,
    description: String,
    date: String,
    time: String,
    address: String,
    var couple: String) : Event(title, description, date, time, address) {
    fun getWeddingDetails(): List<String> {
        val details = mutableListOf(title, description, date, time, address, couple)
        return details
    }
}