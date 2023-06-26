# Apresente uma função em Kotlin equivalente à descrição em bytecode Java apresentada a baixo.
```
public static final double magn(float, float);
    Code:
        0: fload_0
        1: fload_0
        2: fmul
        3: fload_1
        4: fload_1
        5: fmul
        6: fadd
        7: f2d // (float to double)
        8: invokestatic #23 // java/lang/Math.sqrt:(D)D
        11: dreturn
```

[Resolução](../src/main/kotlin/magn.kt)