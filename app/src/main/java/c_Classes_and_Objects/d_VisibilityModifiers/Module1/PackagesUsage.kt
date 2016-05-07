package c_Classes_and_Objects.d_VisibilityModifiers.Module1


/**
 * Calls method in another project module name 'lib'
 * See [PackagesInternalusage] to see how 'internal' members can be accessed from same project module
 */
fun callFunctionOutideFile() {
    // calls functions in another project module - seems to compile but throws error when trying to run
//    functionWithoutClassDefault()
//    functionWithoutClassPublic()

//    calling method with 'internal' modifier - visible only inside this module
//    functionWithoutClassInternal()

//    calling its private peer not allowed
//    functionWithoutClassPrivate()
}