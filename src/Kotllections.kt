fun main(args: Array<String>) {
    println("Hello World")
    createCollections()
    val path = "/Users/Richie/kotlin-book/chapter3.doc"
    parsePath(path)
}

fun createCollections() {
    val numbers = listOf(1, 2, 3).withIndex()
    val strings = setOf("Richie", "Lemmy", "Billy")
    val grades = mapOf("A" to 90..100, "B" to 80..89, "C" to 70..79)

    println(numbers)
    println(strings)
    println(grades)
}

fun parsePath(path: String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, Full Name: $fullName, File Name: $fileName, Extension $extension")
}