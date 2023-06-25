# Indique as propriedades que podem ser encontradas no tipo Foo consultando _memberProperties_

```kotlin
class Foo(a: Int, var b: String, val c: Int, d: Double)
{
    val x : String = "ISEL"
    var y : Int = 2022
}
```

As propriedades que podem ser encontradas no tipo Foo consultadas através de _memberProperties_ são:
- b
- c
- x
- y

São encontrados estes campos pois são os campos declarados e não privados em Foo enquanto que os restantes campos não estão declarados 
