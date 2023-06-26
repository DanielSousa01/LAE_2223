fun main() {
    println("With sequence:")
    val nrs1 = sequenceOf("abc", "def", "super").map { print("$it "); it.length }
    println(nrs1.distinct().count())
    println(nrs1.count())
    println("\nWith array:")
    val nrs2 = arrayOf("abc", "def", "super").map { print("$it "); it.length }
    println(nrs2.distinct().count())
    println(nrs2.count())
}