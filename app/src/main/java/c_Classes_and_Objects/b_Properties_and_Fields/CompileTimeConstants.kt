package c_Classes_and_Objects.b_Properties_and_Fields

internal class CompileTimeConstants

/** Properties the value of which is known at compile time can be marked as compile time constants using the const
 * modifier
 * */
const val SUBSYSTEM_DEPRECATED : String = "this subsystem is deprecated"

/** Such properties can be used in annotations */
@Deprecated(SUBSYSTEM_DEPRECATED) fun foo() {
}
