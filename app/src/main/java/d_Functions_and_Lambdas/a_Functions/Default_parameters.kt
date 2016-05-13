package d_Functions_and_Lambdas.a_Functions


// arguments can even call other arguments
fun testDefaultArguments(array: IntArray, length: Int = array.size) : Int {
    return length
}