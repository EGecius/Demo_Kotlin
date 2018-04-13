package a_GettingStarted.b_idioms

class Singletons

object Resource {
    val name = "Egis"

    fun nameAppended(appended : String) : String {
        return name + "_" + appended
    }
}
