package c_Classes_and_Objects.k_enum_classes

class EnumUsage {

    // simple usage
     enum class Colors {
         RED, BLUE, GREEN
    }

    // bellow should work in Kotlin 1.1:
    inline fun <reified T : Enum<T>> printAllValues() {
//        print(enumValues<T>().joinToString { it.name })
    }

}