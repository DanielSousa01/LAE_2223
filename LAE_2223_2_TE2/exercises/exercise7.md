```kotlin
val nrs = sequenceOf("abc", "def", "super").map { print("$it "); it.length }
println(nrs.distinct().count())
println(nrs.count())
```

# Qual o output da execução do seguinte programa?
abc def super 2
abc def super 3

Pois neste caso estamos a mapear uma sequece de strings para uma operação que dá print do valor presente na sequence e guarda a sua dimenção assim quando,fazemos _.distinct().count()_ esta operação é feita sobre as dimensões das Strings e não sobre as Strings em si.

# Se no lugar de sequenceOf usasse arrayOf existiria alguma diferença? Justifique.
Se no lugar de _sequenceOf_ usar-mos _arrayOf_ o resultado do output será:

abc def super 2
3

Pois aqui os prints sobre as strings presentes no array vão ser executadas durante o _.map_, enquanto que na sequence só é executado durante a iteração sobre a sequence, ou seja, a instrução de print fica armazenada na sequence para ser executada quando esse campo é acedido.
