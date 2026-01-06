package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks

    var list = listOf(Task(1,"boo",true),Task(2,"boo",true))
    var taskList by mutableStateOf<List<Task>>(list)



    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        for (t in taskList){
            if (t.id == taskId){
                t.isCompleted = !t.isCompleted
            }
        }
    }
}
