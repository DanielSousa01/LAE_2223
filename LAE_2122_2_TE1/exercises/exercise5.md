# Considere a função de extensão weaklyCheckedAs para List<*> :
```kotlin
fun <R> List<*>.weaklyCheckedAs() : List<R> {
    if (!isEmpty()) {
        first() as R
    }
    @Suppress("UNCHECKED_CAST")
    return this as List<R>
}
```
## Para que o cast da linha 3 seja efetivo, a linha 1 precisa de duas alterações. Sem essas alterações, é emitido um aviso de “unchecked cast” na linha 3 e o cast é inútil. Apresente e justifique a correção. NOTA: a correção não passa por usar a anotação @Suppress para ocultar o aviso.
[Resolução](../src/main/kotlin/weaklyCheckedAs.kt)

Nesta resolução usou-se uma função _inline_ juntamente com _reified_ que permite que se consiga ter acesso ao tipo dos elementos da lista em tempo de execução 

## O trecho de código _@Suppress("UNCHECKED_CAST")_  oculta um aviso de cast não verificado na linha abaixo. Explique porque o cast não é verificável.

Este _cast_ não é verificado pois não são verificados se todos os elementos da lista presente no this são do tipo R devido ao _type erasure_ do java, pois o tipo genérico não é conhecido em tempo de execução.
Para se poder resolver este problema deve-se fazer uma verificação em cada elemento presente na lista.

[Resolução](../src/main/kotlin/weaklyCheckedAsWithCheckedCast.kt)
