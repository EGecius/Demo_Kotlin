package c_Classes_and_Objects.j_nestedClasses

import android.view.View

/**
 * Shows how to user inner classes
 */
class MyEnclosingClass {


    fun produceListener() {

        // it can be declared like this
        val listener1: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(p0: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }

        // or like this:
        val listener2 = View.OnClickListener { print("onClick")}
    }

    // this class has NO reference to enclosing class
    class MyNestedClass {
        // does not compile
//        val foo = bar
    }

    val bar = 1;

    // this class DOES reference to enclosing class

    inner class MyInnerClass {


        fun findEnclosingClass() {
            val foo = bar
        }
    }

}
