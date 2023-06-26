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

[Resultado](../src/main/kotlin/func.kt)

## Para cada uma das frases abaixo, indique se é verdadeira ou falsa, com a devida justificação:

### Se um programa Kotlin incluir o ficheiro .class com o bytecode indicado à direita, então o gerador de código apresentado à esquerda terá de ser executado, o mais tardar, logo antes da primeira execução do método de extensão.

Verdade

### Considere dois ficheiros: 1. O ficheiro .class produzido pelo gerador da esquerda; e 2. O ficheiro com o código fonte Kotlin do método de extensão. Bastam esses dois ficheiros, para que o compilador de Kotlin possa produzir o bytecode apresentado à direita.

Verdade

### Se um programa compilado para a JVM incluir o ficheiro .class com o bytecode indicado à direita, então o ficheiro .class produzido pelo gerador da esquerda não é necessário para a sua execução.

Falso

### Se um programa compilado para a JVM incluir o ficheiro .class com o bytecode indicado à direita, então é inútil que o mesmo programa também inclua o gerador apresentado à esquerda.

Verdade