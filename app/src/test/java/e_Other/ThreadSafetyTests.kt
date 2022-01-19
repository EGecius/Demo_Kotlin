package e_Other

import io.kotest.matchers.shouldBe
import kotlinx.coroutines.*
import org.junit.Test

class ThreadSafetyTests {

    var sharedCounter = 0
    @Synchronized
    fun updateCounter() {
        sharedCounter++
    }

    @Test
    fun `synchronized annotation works`() = runBlocking {
        val scope = CoroutineScope(newFixedThreadPoolContext(4, "synchronizationPool")) // We want our code to run on 4 threads
        scope.launch {
            val coroutines: List<Job> = 1.rangeTo(1000).map { //create 1000 coroutines (light-weight threads).
                launch {
                    for (i in 1..1000) { // and in each of them, increment the sharedCounter 1000 times.
                        updateCounter() // call the newly created function that is now synchronized
                    }
                }
            }

            coroutines.forEach { corotuine ->
                corotuine.join() // wait for all coroutines to finish their jobs.
            }
        }.join()

        sharedCounter shouldBe 1000_000

        println("The number of shared counter is $sharedCounter")
    }
}
