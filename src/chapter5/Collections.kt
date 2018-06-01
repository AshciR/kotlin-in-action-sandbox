package chapter5

fun main(args: Array<String>) {
    println(countTheLettersInTheWord("Richie"))
}

fun countTheLettersInTheWord(word: String): Map<Char, Int> {
    return word.map { it.toUpperCase() }
            .groupBy { it.toChar() }
            .mapValues { it.value.size }
}