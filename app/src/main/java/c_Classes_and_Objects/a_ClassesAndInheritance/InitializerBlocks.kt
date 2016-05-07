package c_Classes_and_Objects.a_ClassesAndInheritance

/**
 * Shows how initializer blocks work
 */
internal class InitializerBlocks {

    // this value will be initialized in constructors
    val nameAsField: String
    //this value will be initialized in init block
    val initializedInInitBlock : String

    constructor (){
        nameAsField = "default name"
        print("in 1st constructor \n")
    }

    constructor(name: String) {
        nameAsField = name
        print("in 2nd constructor \n")
    }

    init {
        initializedInInitBlock = "initialized_in_init_block"
        //init block is executed before any constructor
        print("in init block \n")
    }
}

