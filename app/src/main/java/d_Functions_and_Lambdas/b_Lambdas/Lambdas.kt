package d_Functions_and_Lambdas.b_Lambdas

fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    val result = arrayListOf<R>()
    for (item in this)
        result.add(transform(item))
    return result
}

fun useMap() {
    val ints = listOf(1, 2, 3)
    val doubled = ints.map { it -> it * 2 }
}


fun transformString(string: String, transform: (String) -> (String)): String {
    return transform(string)
}

fun toUpperCase(string: String): String {
    return transformString(string, { a -> a.toUpperCase() })
}

fun toLowerCase(string: String) = transformString(string, { it -> it.toLowerCase() })

fun combineInts(a: Int, b: Int, combine: (Int, Int) -> (Int)): Int {
    return combine(a, b)
}

fun String.transform(transformLambda: (String) -> String) = transformLambda(this);




