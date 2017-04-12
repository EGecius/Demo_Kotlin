package y_mocking

class DependencyImpl : Dependency

interface Dependency {

    interface Callback {
        fun onSuccess()
    }

    fun alsoDoSomething(i: Int, param: Callback) {
    }

}
