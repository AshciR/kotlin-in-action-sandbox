package chapter6

fun stringLengthSafeVerbose(s: String?): Int =
        if (s != null) s.length else 0

fun stringLengthSafe(s: String?): Int = s?.length?: 0

fun main(args: Array<String>) {
    println("Verbose call")
    println(stringLengthSafeVerbose("Richie"))
    println(stringLengthSafeVerbose(null))
    println("Concise call")
    println(stringLengthSafe("Richie"))
    println(stringLengthSafe(null))
}