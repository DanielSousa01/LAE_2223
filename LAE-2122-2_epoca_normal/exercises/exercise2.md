# Ordene as classes seguintes pelo tamanho do espaço que as suas instâncias ocupam no heap, justificando. Considere que é igual o espaço ocupado por Int ou Float.

```kotlin
class A (val x: Int, val y: Int){
    fun modulus() : Float = sqrt(x.toFloat()*x + y*y)
}
```

```kotlin
class B (val x: Int, val y: Int, var modulus: Float = 0.0)
```

```kotlin
class C (x: Int, y: Int, val modulus: Float = sqrt(x.toFloat()*x + y*y))
```

B, A, C
B é o que ocupa mais espaço no heap pois este possui 3 propriedades (val e/ou var)
A é a segunda class que mais espaço ocupa no heap, pois esta apenas possui 2 propriedades enquanto que a B possui 3.
C é a class que ocupa menos espaço pois possui 2 parâmetros que não são armazenadas no heap e apenas 1 propriede que ocupa espaço no heap 