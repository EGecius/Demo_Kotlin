package e_Other

// since Kotlin 1.4, if you add 'fun' to an interface, they SAM conversation will also be applied it to it

fun interface Transformer<T, U> {
    fun transform(x: T): U
}

val transformer: Transformer<String, Int> = Transformer {
        x: String -> x.length
}
val transformer2 = Transformer {
        x: String -> x.length
}
