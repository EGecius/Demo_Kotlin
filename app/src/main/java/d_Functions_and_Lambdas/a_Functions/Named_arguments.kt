package d_Functions_and_Lambdas.a_Functions



fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
//    ...
}

fun useReformat() {
    reformat("my_string")

    reformat("my_string",
            normalizeCase = true,
            upperCaseFirstLetter = true,
            divideByCamelHumps = false,
            wordSeparator = '_'
    )

    reformat("my_string", upperCaseFirstLetter = false, wordSeparator = '_')

}