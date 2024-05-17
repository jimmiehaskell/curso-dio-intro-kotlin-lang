package funcoes

fun main() {
    fun confirmaString(str: String?): String {
        if (str != null && str.length > 0) {
            return "É uma string de tamanho: ${str.length}."
        } else {
            return "String nula ou vazia."
        }
    }

    println(confirmaString(null))
    println(confirmaString(""))
    println(confirmaString("sou uma string"))
}

/**
fun main() {
    var neverNull: String = "This can't be null"
    // neverNull = null

    var nullable: String? = "You can keep null"
    //    nullable = null

    var inferredNonNull: String = "The compiler assumes non-null"
    // inferredNonNull = null

    fun strLenght(vararg args: String?) {

        var i: Int = 0

        for (arg in args) {
            println("Arg $i - ${arg?.length}")
            ++i
        }
    }

    println(strLenght(neverNull, nullable, inferredNonNull))
}
 */
