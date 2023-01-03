package com.dicoding.todoapp.ui.add

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.todoapp.data.Task
import com.dicoding.todoapp.data.TaskRepository
import kotlinx.coroutines.launch

/**
 * Created by Rahmat Hidayat on 03/01/2023.
 */
class AddTaskViewModel(private val taskRepository: TaskRepository) : ViewModel() {
    fun addTask(task: Task) {
        viewModelScope.launch {
            taskRepository.insertTask(task)
        }
    }
}