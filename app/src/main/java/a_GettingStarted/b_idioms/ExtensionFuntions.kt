package a_GettingStarted.b_idioms

class ExtensionFuntions {

    // this is how you declared extension functions

    fun String.myOwnExtensionFunction() {

    }

    fun this_is_how_you_call_extension_function() {
        "Convert this to camelcase".myOwnExtensionFunction()
    }
}
