package funcoes

fun main() {
    _addSystemUser(4)
    println("Tot sudoers: ${_getSystemUsers().size}")
    _getSystemUsers().forEach {
        println("Some useful info on user $it")
    }

    _addSystemUser(5)
    println("Tot sudenos: ${_getSystemUsers().size}")

    _getSystemUsers().forEach {
        println("Some useful info on user $it")
    }
}

val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers

fun _addSystemUser(systemUser: Int) {
    systemUsers.add(systemUser)
}

fun _getSystemUsers() : List<Int> {
    return sudoers
}
