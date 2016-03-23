package c_Classes_and_Objects.DataClasses

/**
 * 'val' keywords ensure that fields can not be modified, making class immutable
 */
data class ImmutableDataClass(val id: Int, val name: String = "default name")
