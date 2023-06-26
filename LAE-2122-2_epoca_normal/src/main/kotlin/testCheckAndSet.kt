import ValidTextClass.checkAndSet

fun main() {
    val lisbonWeather = Weather("")
    checkAndSet(lisbonWeather, "desc", "Cloudy") // lisbonWeather.desc ⇦ "Cloudy"
    println(lisbonWeather.desc)
    checkAndSet(lisbonWeather, "desc", "Windy") // Lança IllegalArgumentException
}