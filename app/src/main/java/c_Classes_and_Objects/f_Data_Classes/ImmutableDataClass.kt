package c_Classes_and_Objects.f_Data_Classes

/**
 * 'val' keywords ensure that fields can not be modified, making class immutable
 */
data class ImmutableDataClass(val id: Int, val name: String = "default name")
