package lib.package2

import lib.package1.functionWithoutClassDefault
import lib.package1.functionWithoutClassInternal
import lib.package1.functionWithoutClassPublic

class PackagesInternalUsage {

    fun callFunctionOutideFile() {

        // calls functions in another file but same package
        functionWithoutClassDefault()
        functionWithoutClassPublic()

        // calling method with 'internal' modifier - visible because in same module
        functionWithoutClassInternal()

        // calling its private peer not allowed
        // functionWithoutClassPrivate()
    }
}

