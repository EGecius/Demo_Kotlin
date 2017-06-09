package c_Classes_and_Objects.a_ClassesAndInheritance

/**
 * Sealed classes are, in a sense, an extension of enum classes: the set of values for an enum type is also restricted,
 * but
 * each enum constant exists only as a single instance, whereas a subclass of a sealed class can have multiple
 * instances which can contain state
 *  */
class SealedClassUsage {


    /**
     * The key benefit of using sealed classes comes into play when you use them in a when expression. It will not
     * compile if you are not covering all cases or if you have no 'else' statement
     */
    fun eval(exp: Expr): Double = when (exp) {
        is Expr.Const -> exp.number
        is Expr.Sum -> eval(exp.e1) + eval(exp.e2)
        Expr.NotANumber -> Double.NaN
    }

    fun eval(animal: Animal): String {

        when (animal) {
            is Animal.Dog -> return "Dog"
            is Animal.Cat -> return "Cat"
            is Animal.Mouse -> return "Cat"
        }

        /* Compiler recognises that all type have been covered above, and indicates that last line
         is redundant */
        return "Unknown"
    }
}

sealed class Expr {

    class Const(val number: Double) : Expr()
    class Sum(val e1: Expr, val e2: Expr) : Expr()

    object NotANumber : Expr()
}

/** Sealed class can only have private constructors, so they can only be inherited in the same
 * file */
//sealed class Animal public constructor (val age :Int) {
sealed class Animal constructor(val age: Int) {

    class Dog(age: Int) : Animal(age)
    class Cat(age: Int) : Animal(age)
    class Mouse(age: Int) : Animal(age)
}

/** sealed class can also be declared outside the sealed class */
class Mouse(age: Int) : Animal(age)