fun <T : Any> Sequence<T>.repeat(times: Int): Sequence<T> = sequence {
    for (value in this@repeat) {
        repeat(times) { yield(value) }
    }
}

fun main() {
    val sequence = sequenceOf(3, 5, 1, 5)
    val resultSequence = sequence.repeat(3)
    for (value in resultSequence) {
        print("$value, ")
    }
}