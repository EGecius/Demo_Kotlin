package c_Classes_and_Objects.b_Properties_and_Fields

/**
 * With lateinit you can avoid null checks
 * when referencing the property inside the body of a class.
 */

class MyTest {
    lateinit var subject: TestSubject

    fun setup() {
        subject = TestSubject()
    }

    fun test() {
        subject.method()  // dereference directly
    }
}

class TestSubject {
    fun method() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}