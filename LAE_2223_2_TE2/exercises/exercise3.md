# Ordene as classes seguintes pelo tamanho do espaço que as suas instâncias ocupam no heap, justificando:

```kotlin
class X(bar: Int) {
    val nr: Int get() = foo
    companion object {
        val foo = 7657
        val zaz = 1234
        val qux = 9876
    }
}
```

```kotlin
class Y(var bar: Int = 7657, qux: String = "ISEL-LEIC") {
    val nr get() = bar
    val foo get() = nr
}
```

```kotlin
class Z(
    val bar: Int,
    val foo: Int
)
```

Z, Y, X 
Z é o que ocupa mais espaço pois este possui dois valores interios que são armazenados no heap.
Y é o segundo que ocupa mais espaço pois este possui um valor inteiro que é armazenado no heap (propriedade) e uma string que como não é propriedades mas um parmetro não vai ser armazenada no heap
e possui duas outra propriedades que não vão ser armazenadas no heap pois são _getters_.
X é o que ocupa menos espaço pois este não possui nenhum valor que seja armazenado no heap (Proprieade).