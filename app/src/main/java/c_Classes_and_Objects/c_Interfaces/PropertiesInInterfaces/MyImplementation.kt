package c_Classes_and_Objects.c_Interfaces.PropertiesInInterfaces

/**
 * shows that only abstract properties needs overriding
 */
class MyImplementation(override val property: String) : MyInterface
