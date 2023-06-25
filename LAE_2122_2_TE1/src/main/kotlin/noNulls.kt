fun <T : Any> Sequence<T?>.noNulls(): Sequence<T> = sequence {
    for (element in this@noNulls) {
        if (element != null) {
            yield(element)
        }
    }
}