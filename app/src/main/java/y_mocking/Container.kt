package y_mocking

class Container(val dependency: Dependency) {

    fun doTheThing(i: Int) {
        dependency.alsoDoSomething(i, object : Dependency.Callback {
            override fun onSuccess() {
            }
        })
    }

    fun takeDataObject(dataObject: DataObject) {
        dependency.alsoDoSomething(dataObject, object : Dependency.Callback {
            override fun onSuccess() {
            }
        })
    }

}
