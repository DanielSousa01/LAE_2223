# Considere o código fonte Kotlin indicado abaixo, presente no ficheiro _light.kt_. Indique os nomes dos ficheiros _.class_ em que ficam as definições nativas de Adjustable, Light, DIMMED e createLight, após a compilação.

```kotlin
interface Adjustable { fun adjust(diff : Int) }
class Light(private var intensity : Int) : Adjustable {
    override fun adjust(diff : Int) { intensity += diff; update() }
    private fun update() { ... }
}
val DIMMED = 15
fun createLight(intensity: Int = DIMMED) = Light(intensity)
```

- Adustable.class
- Light.class
- lightKt.class