package c_Classes_and_Objects.l_delegated_properties

class LazyDemo {

    var count = 0;

    /* lazy() is a function that takes a lambda and returns an instance of Lazy<T> which can serve as a delegate for
     implementing a lazy property: the first call to get() executes the lambda passed to lazy() and remembers the
     result, subsequent calls to get() simply return the remembered result. */
    val lazyVal by lazy {
        count++
        "Done"
    }

}

