package main.classes.assets

// This is where the main program runs for the Event Planner
class Menu(title: String, options: Map<String, String>) {

    val _displayText: String
    val _title: String = title
    val _options: Map<String, String> = options

    init {
        _displayText = _initDisplay(_title, _options)
    }

    // This function generates the text for _displayText
    fun _initDisplay(title: String, options: Map<String, String>): String {
        var displayText: String = ""
        displayText += """
        |---
        |$title
        |---
        """.trimMargin()
        for ((key: String, value: String) in options) {
            displayText += """
            |
            | - [$key]: $value
            """.trimMargin()
        }
        displayText += """
        |
        |
        |Select an option [select by typing square braket value]:
        """.trimMargin()
        return displayText
    }

    fun Display(): String {
        
        while (true) {
            println(_displayText)
            var option: String = readLine()!!
            if (_options.containsKey(option))
                return option
            else {
                print("$option: Invalid Option")
            }
        }
    }

}