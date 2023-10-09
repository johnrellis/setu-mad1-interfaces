package setu.mad1.interfaces

import java.text.SimpleDateFormat

class XmlDataStore : Datastore {
    override fun write(task: Task) {
        // NEVER DO MANUAL XML!!!!!!!!!
        val xml = "<Task>" +
                "<ToDo>${task.toDo}</ToDo>" +
                "<Due>${SimpleDateFormat("yyyy-MM-dd HH:mm").format(task.dueDate)}</Due>" +
                "</Task>"
        println(xml)
    }
}