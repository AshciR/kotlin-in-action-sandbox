package chapter8

data class SiteVisit(
        val path: String,
        val duration: Double,
        val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
        filter(predicate).map(SiteVisit::duration).average()

fun main(args: Array<String>) {
    val sitesVisits = listOf<SiteVisit>(
            SiteVisit("/", 10.0, OS.WINDOWS),
            SiteVisit("/", 40.0, OS.WINDOWS),
            SiteVisit("/home", 20.0, OS.LINUX),
            SiteVisit("/home", 30.0, OS.MAC),
            SiteVisit("/home", 50.0, OS.MAC),
            SiteVisit("/", 40.0, OS.MAC),
            SiteVisit("/aboutme", 40.0, OS.IOS),
            SiteVisit("/contact", 50.0, OS.ANDROID)
    )

    println(sitesVisits.averageDurationFor { it.os == OS.WINDOWS })
    println(sitesVisits.averageDurationFor { it.os == OS.MAC })
    println(sitesVisits.averageDurationFor { it.path == "/"})

}