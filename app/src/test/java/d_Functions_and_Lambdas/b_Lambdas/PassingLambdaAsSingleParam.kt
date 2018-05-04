package d_Functions_and_Lambdas.b_Lambdas

import org.junit.Test


class PassingLambdaAsSingleParam {


// 3 types of syntax to pass lambda when method has only one param - function

    @Test
    fun `1) Lambdas within parentheses`() {

        val result = "ONE".transform({ it.toLowerCase() })

        assert(result.equals("one"))
    }

    @Test
    fun `2) Lambda outside parentheses`() {

        val result = "ONE".transform() { it.toLowerCase() }

        assert(result.equals("one"))
    }

    @Test
    fun `3) Parentheses completely omitted`() {

        val result = "ONE".transform { it.toLowerCase() }

        assert(result.equals("one"))
    }

}


