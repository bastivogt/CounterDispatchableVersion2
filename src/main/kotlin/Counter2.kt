package org.example

import org.example.sevo.events.Dispatchable

class Counter2(val start: Int = 0, val end: Int = 10, val step: Int = 1): Dispatchable<CounterEvent2, Counter2> {
    override val listeners: MutableMap<String, (CounterEvent2) -> Unit> = mutableMapOf<String, (CounterEvent2) -> Unit>()


    var count: Int
        private set

    init {
        this.count = this.start
    }

    fun run() {
        this.count = this.start
        this.dispatchEvent(CounterEvent2(CounterEvent2.COUNTER_2_START, this, "Joel"))
        for (i in this.count..this.end step this.step) {
            this.count = i
            this.dispatchEvent(CounterEvent2(CounterEvent2.COUNTER_2_CHANGE, this, "Noah"))
        }
        this.dispatchEvent(CounterEvent2(CounterEvent2.COUNTER_2_FINISH, this, "Sevo"))
    }



}