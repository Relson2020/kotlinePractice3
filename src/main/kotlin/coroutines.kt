import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() {

    GlobalScope.launch(Dispatchers.Unconfined) {
    //   println( display("there") )
        println("thread ${Thread.currentThread().name}")
    }


  /*  runBlocking {
        val channel = Channel<String>()
        launch {
            channel.send("A1")
            channel.send("A2")
            log("A done")
        }
        launch {
            channel.send("B1")
          //  channel.send("B2")
            log("B done")
        }
        launch {
            repeat(3) {
                val r = channel.receive()
                log(r)
            }
        }
    }*/

    println("main end ")
    Thread.sleep(2000)
}

fun log(channelResult: Any?) {
    println("${Thread.currentThread().name} $channelResult")

}

suspend fun display(string : String ):String {
    delay(3000L)
    return string
}
