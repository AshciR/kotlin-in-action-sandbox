package chapter8

fun main(args: Array<String>) {
    println("Multiplying 2 * 3 = ${twoAndThree { a, b -> a * b }}")
    println("Addition 2 + 3 = ${twoAndThree { a, b -> a + b }}")
    println("Converting to Hashcode: ${convertTestStringIntoNumber { String.hashCode() }}")
    println("abc1234XYZrichie".filterOutChars { it in 'a'..'z' })
}

fun twoAndThree(operation: (Int, Int) -> Int) = operation(2, 3)

fun convertTestStringIntoNumber(lambda: (String) -> Int) = lambda("TestString")

fun String.filterOutChars(predicate: (Char) -> Boolean): String {
    val builder = StringBuilder()
    (0 until length).forEach { index ->
        val charInString = get(index)
        if (predicate(charInString)) builder.append(charInString)
    }
    return builder.toString()
}


