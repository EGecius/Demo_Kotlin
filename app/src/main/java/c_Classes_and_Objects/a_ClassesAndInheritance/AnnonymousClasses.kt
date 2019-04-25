package c_Classes_and_Objects.a_ClassesAndInheritance

@Suppress("ObjectLiteralToLambda")
fun demoAnnonymous() {

    // Two ways to create an anonymous class

    Runnable {
        // execute
    }

    object : Runnable {
        override fun run() {
            // execute
        }
    }
}