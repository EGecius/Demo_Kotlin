package a_GettingStarted.a_BasicSyntax

/**
 * 'when' operator replaces 'switch' operator
 */
internal class WhenReplacesSwitch {

    fun useWhen(obj: Any): String {

        val result: String

        when (obj) {
            1 -> result = "one"
            2 -> result = "two"
            3 -> result = "three"
            "trys" -> result = "three"
            !is String -> result = "not string"
            else -> result = "unknown"
        }

        return result
    }
}
