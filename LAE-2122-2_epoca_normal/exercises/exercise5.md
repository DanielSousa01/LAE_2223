# Identifique na listagem da função bar as instruções e o tipo de operação de boxing, unboxing ou checkcast que pode ser gerado.

```kotlin
class Pack(val v: Any)
fun bar(): Int {
    val n = 6235
    val p = Pack(n) // boxing
    val res = p.v as Int? // checkcast
    return res ?: 0 // unboxing
}
```