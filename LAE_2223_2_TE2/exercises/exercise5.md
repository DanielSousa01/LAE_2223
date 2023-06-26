# Considere a variável strs, do tipo MutableList<String>:
```kotlin
val strs = mutableListOf("ISEL", "LEIC", "LAE")
```

## Como se consegue colocar um valor de tipo Int nesta lista?

    i.   strs[2] as Int = 5 
    ii.  (strs as Array<Int>)[2] = 5
    iii. (strs as MutableList<Int>).add(5)
    iv.  strs.add(5 as String)

## Resposta: 
iii, porque a passa momentaneamente a MutableList<Int>, adiciona o Int (5) e depois volta a ser MutableList<String>, "enganando" o compilador.