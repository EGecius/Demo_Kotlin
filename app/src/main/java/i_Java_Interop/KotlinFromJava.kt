package i_Java_Interop

class Foo @JvmOverloads constructor(x: Int, y: Double = 0.0) {

    @JvmOverloads
    fun f(a: String, b: Int = 0, c: String = "abc", d : String = "d") { /**/

    }
}
