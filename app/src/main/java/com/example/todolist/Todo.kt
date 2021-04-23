package com.example.todolist

// This class' job is hold data
data class Todo (
        val title: String,
        var isChecked: Boolean = false
)
