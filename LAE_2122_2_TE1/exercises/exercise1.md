# Considere o programa Kotlin do ficheiro fonte indicado ao lado. Indique os nomes dos ficheiros .class resultantes da sua compilação.
## prog.kt
```kotlin
data class Message(val txt : String)
class Printer {
    fun writeln(msg : Message) { println(msg.txt) }
}
val out = Printer()
fun main() {
    out.writeln(Message("Hello"))
}
```

Os ficheiros .class resultantes da compilação são deste código são:
- Message.class
- Printer.class
- progKt.class