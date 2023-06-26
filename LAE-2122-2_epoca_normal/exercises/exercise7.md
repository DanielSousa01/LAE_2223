# Complete a função genérica listOfDefaults<T>(n : Int), que retorna uma lista com n instâncias de T, em que cada instância é criada via createInstance(), usando o construtor sem parâmetros obrigatórios. Ignore a situação de erro quando o tipo T não tem um construtor compatível com createInstance().

```kotlin
/* TO DO : completar assinatura */ listOfDefaults(n : Int = 0) : List<T> {
    val list = mutableListOf<T>()
    // TO DO: adicionar elementos com list.add
    return list
}
// Exemplo de utilização
fun main() {
    val list1 = listOfDefaults<Student>(3)
    val list2 : List<Person> = listOfDefaults(2)
// ...
}
```

Resolução:
```kotlin
inline fun <reified T> listOfDefaults(n : Int = 0) : List<T> {
    val list = mutableListOf<T>()
    repeat(n) {
        val instance = T::class.createInstance()
        list.add(instance)
    }
    return list
}
// Exemplo de utilização
fun main() {
    val list1 = listOfDefaults<Student>(3)
    val list2 : List<Person> = listOfDefaults(2)
// ...
}
```