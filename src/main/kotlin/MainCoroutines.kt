import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds

class MainCoroutines {

    @OptIn(ExperimentalTime::class)
    fun main() = runBlocking {
        log("The first, parent, coroutine starts")
        launch {
            log("The second coroutine starts and is ready to be suspended")
            delay(100.milliseconds)
            log("The second coroutine is resumed")
        }
        launch {
            log("The third coroutine can run in the meantime")
        }
        log("The first coroutine has launched two more coroutines")
    }

    private var zeroTime = System.currentTimeMillis()

    fun log(message: Any?) =
        println("${System.currentTimeMillis() - zeroTime} " +
                "[${Thread.currentThread().name}] $message")

}