package y_mocking

class Container(val dependency: Dependency) {

    fun doTheThing() {
        dependency.alsoDoSomething()
    }

}
