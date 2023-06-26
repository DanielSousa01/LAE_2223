# A utilização de uma instância da classe OutFile corretamente construída (o construtor correu bem) pode falhar na execução de uma das suas instruções. Identifique qual a instrução que pode falhar e justifique em que situação.
## ATENÇÃO: admita que não existem interferências do file system que provoquem esse erro. A origem da falha está na forma de implementação da classe OutFile.

```kotlin
class OutFile(path: String) : Closeable {
    private var out : OutputStream? = FileOutputStream(path)
    fun write(msg: String) = out?.write(msg.toByteArray())
    override fun close() = cleanup()
    protected fun finalize() = cleanup()
    private fun cleanup() { out!!.close(); out = null }
}
```

Null pointer exeption pois o _close_ e o _finalize_ podem ser chamados mais do que uma vez ou serem chamados um a seguir ao outro
