// Something to add emails, names, and other information to the csv file

import java.io.File
import java.io.BufferedWriter
import java.io.FileWriter

fun main() {
    val file = File("Data/userdata.csv")
    var userdata = makeNewUser()

    val newdata = User(name = "New Guy", email = "johndoe@gmail.com", ID = 5)
    writeCsv(file, newdata)

    file.forEachLine { line ->
        val tokens = line.split(",")
        println(tokens)
    }
}

data class User(
    val ID: Int,
    val name: String,
    val email: String
)

fun writeCsv(file: File, newdata: User) {
    BufferedWriter(FileWriter(file, true)).use { writer -> // Append mode
        writer.write("${newdata.ID},${newdata.name},\"${newdata.email}\"")
        writer.newLine()
    }
}

fun makeNewUser(): Triple<Int, String?, String?> {
    val file = File("Data/userdata.csv")
    var id_number = 0
    file.forEachLine {
        id_number++
    }

    println("Lets make an new user. What is the User's name?")
    val nameInput = readLine()
    val name = nameInput

    println("What is the User's email?")
    val emailInput = readLine()
    val email = emailInput
    return Triple(id_number,name,email)
}