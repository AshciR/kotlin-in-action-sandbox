import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
class Product(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            is Product -> eval(e.left) * eval(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    val sum = eval(Sum(Sum(Num(1), Num(2)), Num(4))) // (1 + 2) + 4
    val product = eval(Product(Product(Num(1), Num(2)), Num(4))) // (1 * 2) * 4
    println(sum) // 7
    println(product) // 8
}