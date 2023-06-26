# Dada a definição de FinishFile indique e justifique o que é escrito no ficheiro out.txt como resultado da execução do main com cada uma das implementações de func.
## NOTE: runFinalization() só retorna quando tiverem sido executados todos os finalize pendentes.

```kotlin
class FinishFile(path: String) : Closeable{
    private val out = FileOutputStream(path)
    fun write(msg: String) = out.write(msg.toByteArray())
    fun close(msg: String) {
        write(msg)
        out.close() 
    } 
    override fun close() = close("CLOSED")
    protected fun finalize() = close("FINALIZED")
}
```

```kotlin
val titles = arrayOf("start", "begin", "init")
fun main() {
    try{
        func()
    } finally {
        System.gc()
        System.runFinalization()
    }
}
```

### A
```kotlin
fun func() {
    val ff = FinishFile("out.txt")
    ff.write(titles[7])
    ff.close()
}
```
Dá erro pois não existe o elemento 7 no array titles e escreve FINALIZED pois a função _close_ não é chamada

### B
```kotlin
fun func() {
    FinishFile("out.txt").use {
        it.write(titles[5])
    }
}
```
Dá erro pois não existe o elemento 5 no array titles e escreve CLOSED no ficheiro pois quando é usado o use é aberto o ficheiro e fechado após a execução do código dentro da função use. 

### C
```kotlin
fun func() {
    FinishFile("out.txt").write(titles[2])
}
```
init
FINALIZED
Pois o elemento na posição 2 é _init_ e após a execução da func no main é executado _System.runFinalization()_ que vai chamar a função _finalize_ da class _FinishFile_