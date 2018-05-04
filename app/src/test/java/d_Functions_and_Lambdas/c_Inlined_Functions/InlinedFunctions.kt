package d_Functions_and_Lambdas.c_Inlined_Functions



fun foo() {
    ordinaryFunction {
        // return // ERROR: can not make `foo` return here
    }
}

fun ordinaryFunction(myLambda: () -> Unit) {
    myLambda()
}

fun foo2() {
    inlineFunction {
        print("this")
        return
    }
}

inline fun inlineFunction(myLambda: () -> Unit) {
    myLambda()
}
