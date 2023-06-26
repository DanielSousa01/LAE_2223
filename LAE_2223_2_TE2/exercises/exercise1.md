# Considere o programa Kotlin do ficheiro fonte indicado abaixo.
## classes.kt
```kotlin
import java.io.Closeable
interface Printable { fun printIt() }
class Info(val code : Int, val text : String) : Printable, Closeable {
    override fun printIt() { println("Info($code) { text: \"$text\"}") }
    override fun close() { println("Info($code) -- Done") }
}
fun texts() = sequence { yield("ISEL"); yield("LEIC"); yield("LAE") }
fun main() {
    var count = 1
    texts().map { Info(count++, it) }.forEach { it.use { info -> info.printIt() } }
}
```

## Diga, justificando, quantos ficheiros .class resultam da sua compilação e indique os respectivos nomes, quando não contêm o carácter $.
Da compilação deste programa resultam 3 ficheiros _.class_, pois são 3 as classes definidas no programa.
- Printable
- Info
- classesKt

## Indique, justificando, qual a instrução de bytecode Java usada para ler o valor da variável count em Info(count++, it) na função main.
A instrução de bytecode Java usada para ler o valor da variável count em Info(count++, it) na função main é _iload_, para que o valor inteiro seja carregado no stack.

## Indique, justificando, qual o número de estados da máquina de estados (invokeSuspend) gerada para a sequência da função texts.
O número de estados da máquina de estados (invokeSuspend) gerada para a sequência da função texts é 4.