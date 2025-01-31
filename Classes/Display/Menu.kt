package display

// This is where the main program runs for the Event Planner
class Menu(val title: String, val options: Map<String: String>) {

    val _displayText: String

    init {
        _displayText = _initDisplay()
    }

    // Input loop for Event Planner
    fun _InitDisplay(val title: String, options: Map<String: String>) {
        var displayText: String = ""
        displayText: String += """
        |---
        |$title
        |---
        """.trimMargin()
        for ((key: String, value: String) in options: Map<String: String>) {
            
        }
    }

    fun _InitMenuDict() {

    }

    fun Display() {
        
    }
    fun Execute() {

    }
}