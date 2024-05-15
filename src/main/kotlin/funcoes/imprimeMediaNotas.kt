package funcoes

// Imprime uma média de notas que são passadas para a função
// através da notação “vararg”.
//
// Na aula também foi abordada a possibilidade de passar os
// parâmetros fora da ordem no qual foi definida na função.

fun imprimeMediaNotas(vararg notas: Double) {
    val count: Int = notas.size
    var i = 0
    var somaNota: Double = 0.0
    var media: Double = 0.0

    for (nota in notas) {
        if (i == 0) ++i

        println("[nota] $i - $nota")
        somaNota += nota
        ++i
    }
    media = somaNota / count
    println("[Média] - ${String.format("%.3f", media)}")
}


fun main() {
    imprimeMediaNotas(9.0, 10.0, 8.5, 7.3, 9.6)
}
