package c_Classes_and_Objects.c_Interfaces.PropertiesInInterfaces

interface MyInterface {


    val property: String // abstract - needs overriding by implementations

    val propertyWithImplementation: String // does not need to be overridden
        get() = "set_in_interface"

    fun printPropertyWithImplementation() {
        print(propertyWithImplementation)
    }



}