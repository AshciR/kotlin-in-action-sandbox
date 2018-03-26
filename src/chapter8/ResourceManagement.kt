package chapter8

import java.io.BufferedReader
import java.io.FileReader

// The use function is a extension function called on a closeable resource
// It takes a lambda and ensures that the resource is closed whether or not
// the lambda/action completes successfully
fun readFirstLineFromFile(path: String) : String = BufferedReader(FileReader(path)).use { return it.readLine() }

fun main(args: Array<String>) {
    val inputFileLocation = "/Users/Richie/Documents/intlliJWorkspace/kotlin-in-action-sandbox/src/chapter8/TestFile.txt"
    println(readFirstLineFromFile(inputFileLocation))
}