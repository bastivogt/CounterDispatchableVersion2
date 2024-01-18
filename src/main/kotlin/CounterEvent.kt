package org.example

import org.example.sevo.events.Event

class CounterEvent(type: String, sender: Counter, name: String): Event<Counter>(type, sender) {

    val name: String = name

    companion object {
        val COUNTER_START: String = "counter-start"
        val COUNTER_CHANGE: String = "counter-change"
        val COUNTER_FINISH: String = "counter-finish"
    }


}