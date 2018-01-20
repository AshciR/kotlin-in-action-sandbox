package chapter6

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String = this.company?.address?.country ?: "Unknown"

fun printShippingLabel(person: Person){
    val address = person.company?.address?: throw IllegalArgumentException("No address")

    with(address){
        println(streetAddress)
        println("$zipCode, $city, $country")
    }
}

fun main(args: Array<String>) {
    val address = Address("123 Rain Dr",
            67890,
            "Kingston",
            "Jamaica")

    val company = Company("Rest Stop", address)
    val richie = Person("Richie", company)

    println(richie.countryName())

    println("--- Printing Shipping Labels ---")
    printShippingLabel(richie)
    println()

    try {
        printShippingLabel(Person("Alex", null))
    } catch (ex: IllegalArgumentException){
        println("Should throw an exception b/c the address for Alex is missing")
    }
}

