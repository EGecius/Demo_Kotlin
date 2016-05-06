package a_a_BasicSyntax

internal class TypeChecks {

    /** Shows how if type detected, no further casting is needed */
    fun getDoubleString(obj: Any): String? {

        if (obj is String) {
            val doubleString = obj + obj
            return doubleString
        }
        return null;
    }

}
