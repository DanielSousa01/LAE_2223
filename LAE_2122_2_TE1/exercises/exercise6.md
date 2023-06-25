# Recorrendo a sequence e yield, construa a função de extensão noNulls para Sequence<T?>, que produz de forma lazy uma sequência com os mesmos elementos da sequência de entrada, excepto os null.
```kotlin
fun <T : Any> Sequence<T?>.noNulls(): Sequence<T>
```

[Resolução](../src/main/kotlin/noNulls.kt)
