# Recorrendo a sequence e yield, construa a função de extensão repeat, que produz de forma lazy uma nova sequência que repete cada elemento da sequência de entrada o número de vezes especificado por parâmetro.
## Exemplo: sequenceOf(3, 5, 1, 5).repeat(3) produz uma sequência com 3, 3, 3, 5, 5, 5, 1, 1, 1, 5, 5, 5

```kotlin
fun <T : Any> Sequence<T>.repeat(times: Int): Sequence<T>
```

[Resolução](../src/main/kotlin/repeat.kt)