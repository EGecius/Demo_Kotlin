package b_Basics.c_ControlFlow

/**
 * Single responsibility:
 * //todo
 */
class BasicTypes {

    fun getStringLiteralEscaped() : String {
        return "hello \nworld"
    }

    fun getStringLiteralRaw() :String {
        return """
for (c in "foo")
print(c)
"""
    }
}