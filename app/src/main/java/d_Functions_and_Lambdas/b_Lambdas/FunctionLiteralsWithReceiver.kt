package d_Functions_and_Lambdas.b_Lambdas



class FunctionLiteralsWithReceiver {

    fun useLiteral(x : Int, y : Int) = x.sum(y)


    val sum = fun Int.(other : Int) : Int = this + other

}
/**
 * //todo
 */