package main
import classes.Program

// Main to run the program
fun main() {
    val program = Program()
    program.run()
}

/***********************************************************************

Commands for compiling and running all .kt files together in one project
------------------------------------------------------------------------
NOTE: ALL files must be error free in order for the compile command to work

Mac OS (zsh):

kotlinc $(find . -name "*.kt") -include-runtime -d main.jar
java -jar main.jar


Windows (powershell):

kotlinc (Get-ChildItem -Path . -Recurse -Filter "*.kt").FullName -include-runtime -d output.jar
java -jar main.jar

************************************************************************/ 



// // distributes work of the event by the number of contributers 
// fun distribute_work() {
//     continue
// }