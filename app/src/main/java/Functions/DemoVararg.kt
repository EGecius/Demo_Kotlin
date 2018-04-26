@file:Suppress("MemberVisibilityCanBePrivate")

package Functions

class DemoVararg{

    fun takeVararg(vararg strings: String) { /* ... */ }

    fun demo2WaysToPassVarargArgs() {

        // 1. Pass params
        takeVararg("one", "two")
        // 2. use 'spread operator' -- '*' -- changes expected type from String to Array<out String>
        takeVararg(strings = *arrayOf("a", "b", "c"))
    }
}