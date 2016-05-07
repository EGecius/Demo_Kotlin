package c_Classes_and_Objects.a_ClassesAndInheritance

/**
 * Shows how initializer blocks work
 */
internal class InitializerBlocks {

    val nameAsField: String

    constructor (){
        nameAsField = "default name"
        print("in 1st constructor \n")
    }

    constructor(name: String) {
        nameAsField = name
        print("in 2nd constructor \n")
    }

    init {
        //init block is executed before any constructor
        print("in init block \n")
    }
}

