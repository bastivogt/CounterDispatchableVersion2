package org.example

import org.example.sevo.events.EventDispatcher

class Counter(var start: Int = 0, var end: Int = 10, var step: Int = 1): EventDispatcher<CounterEvent, Counter>() {
    var count: Int
        private set

    init {
        this.count = this.start
    }

    fun run() {
        this.count = this.start
        this.dispatchEvent(CounterEvent(CounterEvent.COUNTER_START, this, "Sevo"))
        for (i in this.count..this.end step this.step) {
            this.count = i
            this.dispatchEvent(CounterEvent(CounterEvent.COUNTER_CHANGE, this, "Ute"))
        }
        this.dispatchEvent(CounterEvent(CounterEvent.COUNTER_FINISH, this, "Günther"))
    }


}