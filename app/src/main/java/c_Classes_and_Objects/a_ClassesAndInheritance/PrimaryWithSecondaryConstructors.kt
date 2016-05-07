package c_Classes_and_Objects.a_ClassesAndInheritance

internal class PrimaryWithSecondaryConstructors(val name: String) {

    //property is initialized before secondary constructor is called
    val setValue = "set_value"

    var surname: String? = null
        //setter method called every time property is set
        set(value) {
            print("in setter of surname: $value \n")
        }

    // if primary is present call to it is expected from secondary ones with 'this'
    constructor(name: String, surname: String) : this(name) {
        print("in secondary constructor; setValue $setValue \n")
        //constructor can reassign already initialized fields
        this.surname = surname
    }

}
