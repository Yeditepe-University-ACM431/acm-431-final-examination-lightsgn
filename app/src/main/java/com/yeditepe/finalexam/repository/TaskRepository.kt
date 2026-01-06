package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        val tasks = api.getTasks()
        // TODO 2: Convert TaskDto list to Task list
        val taskList = mutableListOf<Task>()
        for (t in tasks) {
            val task = Task(
                id = t.id,
                title = t.title,
                isCompleted = t.completed
            )
            taskList.add(task)
        }
        return taskList
    }
}
