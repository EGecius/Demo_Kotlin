package c_Classes_and_Objects.c_Interfaces.PropertiesInInterfaces

interface MyInterface {

    val property: String // abstract - needs overriding by implementations

    val propertyWithGetter: String // does not need to be overridden
        get() = "set_in_interface"

    // initialized properties do not compile
//    val propertyInitialized: String = "initialized"

    // interfaces can have bodies
    fun printPropertyWithImplementation() {
        print(propertyWithGetter)
    }

}