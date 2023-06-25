# Qual das seguintes implementações mais se aproxima da função de extensão use definida na biblioteca padrão da linguagem Kotlin? Justifique a sua escolha.

## A
```kotlin
fun <T : Closeable, R> T.use(func: (T) -> R) : R {
    try {
        return func(this)
    } finally {
        close()
    }
}
```

## B
```kotlin
fun <T> Collection<T>.use(func: (T) -> Unit) {
    for (item in this) {
        func(item)
    }
}
```

## C
```kotlin
fun <T : Closeable, R>
        Sequence<T>.use(func: (T) -> R) :
        Sequence<R> = sequence {
        for (item in this@use) {
            try {
                yield(func(this))
            } finally {
                item.close()
            }
        }
    }
```

A implementação que mais se aproxima da função de extensão _use_ definida na biblioteca Kotlin é a implementação A pois esta implementação chama a função de _callback_ e fecha a mesma após a sua execução.
