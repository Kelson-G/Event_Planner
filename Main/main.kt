package main
import main.classes.Program

// Main to run the program
fun main() {
    val program = Program()
    program.run()
}

/*
Current Files Compiling:

kotlinc main.kt Classes/Program.kt Classes/Display/Menu.kt Classes/Events/Event.kt Classes/Entities/Task.kt -include-runtime -d main2.jar

*/ 

/***********************************************************************

Commands for compiling and running all .kt files together in one project
------------------------------------------------------------------------
NOTE: ALL files must be error free in order for the compile command to work

Mac OS (zsh):

kotlinc $(find . -name "*.kt") -d main.jar
java -jar main.jar


Windows (powershell):

kotlinc (Get-ChildItem -Path . -Recurse -Filter "*.kt").FullName -include-runtime -d output.jar
java -jar main.jar

************************************************************************/ 