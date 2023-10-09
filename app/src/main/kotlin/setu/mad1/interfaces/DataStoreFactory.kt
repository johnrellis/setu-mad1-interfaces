package setu.mad1.interfaces

import java.lang.RuntimeException

class DataStoreFactory {
    fun create(type: String) :Datastore{
        return when(type){
            "xml" -> XmlDataStore()
            else -> throw RuntimeException("It's all over")
        }
    }
}