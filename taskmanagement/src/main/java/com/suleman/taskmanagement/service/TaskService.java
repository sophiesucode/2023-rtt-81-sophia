package com.suleman.taskmanagement.service;


import com.suleman.taskmanagement.model.Task;
import com.suleman.taskmanagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId).orElse(null);
    }

    public List<Task> getTasksByCategoryName(String categoryName) {
        return taskRepository.findByCategoryName(categoryName);
    }

    public Task getTaskByTitle(String title){
        return taskRepository.findByTitle(title);
    }

    public List<Task> getTasksByTagName(String tagName) {
        return taskRepository.findByTagsName(tagName);
    }

    public List<Task> getTasksByPriority( String priority) {
        return taskRepository.findByPriority(priority);
    }

    public List<Task> getTasksDueBefore(String dueDate) {
        return taskRepository.findByDueDateBefore(dueDate);
    }

    public List<Task> getTasksDueAfter(String dueDate) {
        return taskRepository.findByDueDateAfter(dueDate);
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public Task createTask(Task task) {

        return taskRepository.save(task);
    }
    public List<Task> getTasksByColumn(String columnName) {
        return taskRepository.findByCategoryName(columnName);
    }

    public void deleteTaskById(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}

