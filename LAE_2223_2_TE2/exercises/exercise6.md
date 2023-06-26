# Identifique na listagem da função hot() as instruções que podem gerar operações de boxing, unboxing e checkcast, justificando.

```kotlin
fun hot() {
    val other: Int?
    val n = 6545 // -> coercion
    other = n // -> boxing
    val res = n.equals("ola") // -> coercion
    val end = other + res as Int // -> unboxing + checkcast
}
```
