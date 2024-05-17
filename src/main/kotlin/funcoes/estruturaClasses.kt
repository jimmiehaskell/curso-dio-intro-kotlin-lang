package funcoes

/**
 * Estudo de classes e classes genericas
 */

// Implementação de um pilha

fun main() {
    val stack = MutableStack(8.4, 7.6, 10)
    println(stack)

    println("isEmpty(): ${stack.isEmpty()}")
    println("size(): ${stack.size()}")
    println("push(): ${stack.push(9.6)}")
    println("size(): ${stack.size()}")
    println("peek(): ${stack.peek()}")
    println(stack)

    for (item in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

}

/**
 * Continuar os estodos com funções genéricas...
 */
class MutableStack<E>(vararg itemsStack: E) {
    private val elements = itemsStack.toMutableList() // Converte os elementos da string para uma MutableList()

    fun push(element: E) = elements.add(element) // Adiciona um novo elemento ao final da pilha

    fun peek(): E = elements.last() // Retorna o ultimo elemento da pilha, sem remover o mesmo

    fun pop(): E = elements.removeAt(elements.size - 1) // Remove o ultimo elemento da pilha

    fun isEmpty(): Boolean = elements.isEmpty() // Retorna se a pilha está vazia

    fun size(): Int = elements.size // Retorna o tamanho da pilha

    override fun toString(): String = "MutableStack(${elements.joinToString()})"
}
