package com.egecius.demo_kotlin.types

import Functions.doubleTheString

/**
 * Acts as a parent class
 */
open class ParentType(private val baseTitle: String = "default") {

    public val publicString = "public_string"

    private val privateString = "private_string"

    fun callExtendedMethod(): String {

        /* show that private strings can be used too */
        doubleTheString(privateString)

        return doubleTheString(publicString)
    }

}

