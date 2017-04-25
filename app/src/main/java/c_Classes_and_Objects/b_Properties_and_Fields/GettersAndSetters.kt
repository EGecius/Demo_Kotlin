package c_Classes_and_Objects.b_Properties_and_Fields

class GettersAndSetters {

    var size = 0

    var myValue = 0
        private set // this prevent setter from being called outisde the class

    val isEmpty : Boolean
        get() = this.size == 0

}