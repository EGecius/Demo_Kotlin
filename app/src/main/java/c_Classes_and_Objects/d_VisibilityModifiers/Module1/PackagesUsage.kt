package c_Classes_and_Objects.d_VisibilityModifiers.Module1

import lib.package1.functionWithoutClassDefault
import lib.package1.functionWithoutClassPublic

/**
 * Calls method in another project module name 'lib'
 * See [PackagesInternalusage] to see how 'internal' members can be accessed from same project module
 */
fun callFunctionOutideFile() {
    // calls functions in another file but same package
    functionWithoutClassDefault()
    functionWithoutClassPublic()

//    calling method with 'internal' modifier - visible only inside this module
//    functionWithoutClassInternal()

//    calling its private peer not allowed
//    functionWithoutClassPrivate()
}