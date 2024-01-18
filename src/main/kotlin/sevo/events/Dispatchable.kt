package org.example.sevo.events



interface Dispatchable<T: Event<C>, C> {

    val listeners: MutableMap<String, (T) -> Unit>



    fun hasListener(type: String): Boolean {
        return this.listeners.containsKey(type)
    }

    fun addListener(type: String, listener: (T) -> Unit): Boolean {
        if(!this.hasListener(type)) {
            this.listeners.put(type, listener)
            return true
        }
        return false
    }


    fun removeListener(type: String): Boolean {
        if(this.hasListener(type)) {
            this.listeners.remove(type)
            return true
        }
        return false
    }


    fun dispatchEvent(event: T): Boolean {
        if(this.hasListener(event.type)) {
            this.listeners.get(event.type)?.invoke(event)
        }
        return false
    }
}