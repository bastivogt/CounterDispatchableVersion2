package org.example

fun main() {
    val counter = Counter()

    counter.addListener(CounterEvent.COUNTER_START) {counterEvent: CounterEvent ->
        println("type: ${counterEvent.type} count: ${counterEvent.sender.count} name: ${counterEvent.name}")
    }

    counter.addListener(CounterEvent.COUNTER_CHANGE) {counterEvent: CounterEvent ->
        println("type: ${counterEvent.type} count: ${counterEvent.sender.count} name: ${counterEvent.name}")
    }

    counter.addListener(CounterEvent.COUNTER_FINISH) {counterEvent: CounterEvent ->
        println("type: ${counterEvent.type} count: ${counterEvent.sender.count} name: ${counterEvent.name}")
    }


    //counter.removeListener(CounterEvent.COUNTER_CHANGE)


    counter.run()
    println("============================================================================")


    val counter2 = Counter2(20, 50, 2)

    counter2.addListener(CounterEvent2.COUNTER_2_START) {counterEvent2: CounterEvent2 ->
        println("type: ${counterEvent2.type} count: ${counterEvent2.sender.count} name: ${counterEvent2.name}")
    }

    counter2.addListener(CounterEvent2.COUNTER_2_CHANGE) {counterEvent2: CounterEvent2 ->
        println("type: ${counterEvent2.type} count: ${counterEvent2.sender.count} name: ${counterEvent2.name}")
    }

    counter2.addListener(CounterEvent2.COUNTER_2_FINISH) {counterEvent2: CounterEvent2 ->
        println("type: ${counterEvent2.type} count: ${counterEvent2.sender.count} name: ${counterEvent2.name}")
    }


    counter2.run()
}