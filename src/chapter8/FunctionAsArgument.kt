package chapter8

fun main(args: Array<String>) {
    println("Multiplying 2 * 3 = ${twoAndThree{ a, b -> a * b}}")
    println("Addition 2 + 3 = ${twoAndThree{ a, b -> a + b}}")
}

fun twoAndThree(operation: (Int, Int) -> Int) = operation(2, 3)

