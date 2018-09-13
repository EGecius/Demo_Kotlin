@file:Suppress("MemberVisibilityCanBePrivate")

package Functions

class DemoVararg {

    fun takeVararg(vararg strings: String) {
        /* ... */
    }

    fun demo2WaysToPassVarargArgs() {

        // 1. Pass params
        takeVararg("one", "two")
        // 2. use 'spread operator' -- '*' -- makes array elements appear like multiple params,
        // just like vararg would expect
        takeVararg(strings = *arrayOf("a", "b", "c"))
    }
}