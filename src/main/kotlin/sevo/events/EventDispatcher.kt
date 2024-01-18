package org.example.sevo.events

open class EventDispatcher<T: Event<C>, C>() : Dispatchable<T, C>  {

    override val listeners: MutableMap<String, (T) -> Unit> = mutableMapOf<String, (T) -> Unit>()

}