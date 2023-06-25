import kotlin.reflect.KClass

inline fun <reified R: Any> List<*>.weaklyCheckedAsWithCheckedCast() : List<R> {
    if (!isEmpty()) {
        first() as R
    }
    return this.checkedCast(R::class)
}

inline fun <reified T : Any> List<*>.checkedCast() : List<T> {
    return this.checkedCast(T::class)
}

fun <T : Any> List<*>.checkedCast(klass : KClass<T>) : List<T> {
    forEach {
        if(it != null) {
            if(!klass.java.isAssignableFrom(it::class.java))
                throw ClassCastException("${it::class.java} not compatible with ${klass.simpleName}")
        }
    }
    return this as List<T>
}