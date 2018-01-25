package chapter7

data class Point(val x: Int, val y: Int){
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main(args: Array<String>) {
    val p1 = Point(1,1)
    val p2 = Point(4,5)

    println("Point 1: $p1, Point 2: $p2")
    println("Adding two points together ${p1 + p2}")
}