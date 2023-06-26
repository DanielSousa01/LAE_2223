# Considere uma anotação que define a gama de valores aceites numa propriedade de tipo String. Por exemplo, se a propriedade desc na classe **Weather** só aceita os valores "Sunny", "Cloudy", "Rainy", essa propriedade é anotada na forma:

```kotlin
@ValidText(arrayOf("Sunny", "Rainy", "Cloudy")) var desc: String
```
# Implemente a anotação **ValidText** e a função **checkAndSet** que afecta uma propriedade se o valor recebido pertencer à gama de valores anotados na propriedade, caso contrário lança excepção. Exemplo:

```kotlin
checkAndSet(lisbonWeather, "desc", "Cloudy") // lisbonWeather.desc ⇦ "Cloudy"
checkAndSet(lisbonWeather, "desc", "Windy") // Lança IllegalArgumentException
```

[Anotação](../src/main/java/ValidText.java)
[Implementação de checkAndSet](../src/main/java/ValidTextClass.java)
[Weather class](../src/main/kotlin/Weather.kt)
