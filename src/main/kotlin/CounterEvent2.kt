package org.example

import org.example.sevo.events.Event

class CounterEvent2(type: String, sender: Counter2, name: String): Event<Counter2>(type, sender) {

    val name: String = name

    companion object {
        val COUNTER_2_START: String = "counter-start"
        val COUNTER_2_CHANGE: String = "counter-change"
        val COUNTER_2_FINISH: String = "counter-finish"
    }


}