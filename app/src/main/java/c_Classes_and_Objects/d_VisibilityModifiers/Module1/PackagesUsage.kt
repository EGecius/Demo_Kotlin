package c_Classes_and_Objects.d_VisibilityModifiers.Module1

fun callFunctionOutideFile() {
    // calls functions in another file but same package
    functionWithoutClassDefault()
    functionWithoutClassPublic()
    functionWithoutClassInternal()

    // calling its private peer not allowed
//    functionWithoutClassPrivate()
}