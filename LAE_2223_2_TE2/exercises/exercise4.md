# O troço de código à esquerda, suportado pela biblioteca Cojen/Maker, é usado para gerar o código fonte de um tipo que será posteriormente utilizado num programa Kotlin. O excerto de bytecode à direita resulta da compilação de um método de extensão, escrito em Kotlin, para o tipo gerado pelo código à esquerda (estão omitidos os dois checkNotNullParameter que são realizados sobre os parâmetros do método de extensão).

```kotlin
fun generateCode() : ClassMaker {
    val cm = ClassMaker.beginExternal("Valuer").interface_().public_()
    cm.addMethod(Int::class.java, "estimate", String::class.java).public_().abstract_()
    return cm
}
```

```
12: aload_0
13: aload_1
14: invokeinterface #23, 2
19: iconst_2
20: iadd
21: iconst_5
22: idiv
23: ireturn
```

## Apresente código fonte Java ou Kotlin equivalente ao gerado pelo troço de código à esquerda.

[Resultado](../src/main/java/Valuer.java)

## Apresente o código fonte Kotlin que dá origem ao bytecode apresentado à direita.