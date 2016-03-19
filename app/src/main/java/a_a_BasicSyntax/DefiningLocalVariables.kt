package a_a_BasicSyntax

internal class DefiningLocalVariables {

    fun asignInferred() : Int {
        val a = 4;
        return a
    }

    fun asignNonInferred() : Int {
        val a: Int = 4;
        return a
    }

    fun asignMutable() : Int {
        var a: Int = 4;
        a += 1
        return a
    }
}
