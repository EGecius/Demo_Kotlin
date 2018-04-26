package c_Classes_and_Objects.f_Data_Classes

/**
 * This is java class that instantiates Kotlin object so that I could write tests for usage of Kotlin in Java
 */
internal class ImmutableListWrapper_Usage {

    fun getImmutableListWrapper(list: MutableList<String>): ImmutableListWrapper {
        return ImmutableListWrapper(list)
    }

}
