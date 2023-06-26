# Pretende-se desenvolver, em Java, o método estático genérico VarUtils.getPublicVarGettersOf que retorna um mapa a associar os nomes das propriedades publicamente mutáveis do tipo T, excepto as anotadas com @get:DontRead, às instâncias de Method correspondentes aos respectivos métodos getter.

## Escreva em Kotlin a anotação @DontRead, aplicável apenas a getters, e apresente em Java o método estático getPublicVarGettersOf, incluindo a sua assinatura completa.

[Anotação](../src/main/java/DontRead.java)
[getPublicVarGettersOf](../src/main/java/VarUtils.java)

## Complete o método showVars, tirando partido do método getPublicVarGettersOf, de modo a que o programa de exemplo (abaixo, à esquerda) produza no standard output o texto (não sublinhado) que se vê à direita do exemplo.

[showVars](../src/main/java/VarUtils.java)