 # Um dos garbage collectors disponível na JVM incluída no JDK17 é o G1, que a Oracle sumariza assim: «G1 is a generational, incremental, parallel, mostly concurrent, stop-the-world, and evacuating garbage collector». O que significa, no âmbito de um garbage collector, cada um dos termos sublinhados?

Generational -> O garbage collector atribui um número que corresponde à geração do objeto.

Incremental -> A geração de cada objeto é incrementada por cada análise realizada pelo GC

Parallel -> O GC pode utilizar multiplas Threads para realizar a limpeza

Mostly concurrent -> O GC trabalha concorrentemente ao analizar os objetos existentes nos scopes de multiplas threads

Stop-the-world -> Suspende todos os pontos de execução para realizar a analise

Evacuating -> Move objetos entre blocos de memória ao realizar a análise para compactar os objetos que estão a ser utillizados para poupar o espaço utilizado