class Weather(
    @ValidText(values = arrayOf("Sunny", "Rainy", "Cloudy"))
    var desc: String
) {}