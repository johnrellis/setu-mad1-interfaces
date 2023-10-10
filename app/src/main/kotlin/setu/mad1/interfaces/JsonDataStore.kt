package setu.mad1.interfaces

import java.text.SimpleDateFormat


class JsonDataStore : Datastore, Runnable {
    override fun write(task: Task) {
       // NEVER DO THIS BY HAND
        val json = """{"todo":${task.toDo}, "Due": ${SimpleDateFormat("yyyy-MM-dd HH:mm").format(task.dueDate)}}"""
        println(json)
    }

    override fun run() {
        TODO("Not yet implemented")
    }

}