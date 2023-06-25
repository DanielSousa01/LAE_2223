import kotlin.reflect.KMutableProperty1

fun <T, V> setMany(objs : Array<T>, prop : KMutableProperty1<T, V>, value : V) {
    for (obj in objs) {
        prop.set(obj, value)
    }
}
