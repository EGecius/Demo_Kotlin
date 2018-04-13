package b_Basics.c_ControlFlow

class BasicTypes {

    fun getStringLiteralEscaped(): String {
        return "hello \nworld"
    }

    fun getStringLiteralRaw(): String {
        return """
for (c in "foo")
print(c)
"""
    }

    fun getStringTemplate(): String {

        val i = 10
        val s = "i = $i"
        return s
    }

    fun getStringTemplateWithArbitraryExpression() :String {
        val s = "abc"
        return "$s.length is ${s.length}"
    }
}