package c_Classes_and_Objects.b_Properties_and_Fields

class ListWrapper(val list : List<String>) {

    /** Getters are written by default but they can be overridden as bellow */
    val isEmpty: Boolean
        get() = list.size == 0

    val size: Int
        get() = list.size

}
