package c_Classes_and_Objects.d_VisibilityModifiers.Module1

class Setters {

    var bar: Int = 5 // property is visible everywhere
        private set         // setter is visible only in example.kt

}

fun trySettingPrivateSetter() {
    val setters = Setters()

    val value = setters.bar

    // setter does not compile because it's private
//    setters.bar = 3;

}