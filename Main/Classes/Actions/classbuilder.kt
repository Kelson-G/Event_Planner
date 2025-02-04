package classes.actions

import kotlinx.serialization.Serializable
import classes.events.Event
// Creates Classes (Which go inside the Classes_Built) based on the Event Class (Child classes)

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.0")
}

open class BaseClass {
    open fun greet(): String {
        return "Hello from BaseClass!"
    }
}

@Serializable
data class UserDefinedClass(
    val className: String,
    val methods: Map<String, String>
)