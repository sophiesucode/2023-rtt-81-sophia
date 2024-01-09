package com.suleman.taskmanagement.controller;

import com.suleman.taskmanagement.model.Task;
import com.suleman.taskmanagement.model.User;
import com.suleman.taskmanagement.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TaskController {



    @PostMapping("/tasks/create")
    public String createTask(@ModelAttribute("newTask") @Valid Task task, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "redirect:/tasks?error";
        }
//
//        taskService.createTask(task);

        model.addAttribute("successMessage", "Task created successfully!");

        // Redirect to the tasks page (without query parameters)
        return "redirect:/tasks";
    }

//    @GetMapping("/tasks")
//    public String showTasks(Model model) {
//
//        List<Task> tasksToDo = taskService.getTasksByColumn("To Do");
//        List<Task> tasksInProgress = taskService.getTasksByColumn("In Progress");
//        List<Task> tasksDone = taskService.getTasksByColumn("Done");
//
//        // Add tasks and a new task object to the Thymeleaf model
//        model.addAttribute("tasksToDo", tasksToDo);
//        model.addAttribute("tasksInProgress", tasksInProgress);
//        model.addAttribute("tasksDone", tasksDone);
//
//        // Add a new task object for the form submission
//        model.addAttribute("newTask", new Task());
//
//        return "tasks";
//    }


//    @GetMapping("/login")
//    public String login() {
//
//        return "login";
//    }
//    @GetMapping("/register")
//    public String showRegistrationForm(Model model) {
//        ArtCollector collector = new ArtCollector();
//        model.addAttribute("Collector", collector);
//        return "artcollectorregistration";
//    }

    @GetMapping("/tasks/edit/{taskId}")
    public String editTask(@PathVariable Long taskId, Model model) {
        // Retrieve task by ID and add it to the model
        Task task = taskService.getTaskById(taskId);
        model.addAttribute("taskToEdit", task);
        return "edit-task";
    }

//    @PostMapping("/tasks/edit/{taskId}")
//    public String updateTask(@PathVariable Long taskId, @ModelAttribute("taskToEdit") @Valid Task updatedTask, BindingResult result) {
//
//    }
//
//    @GetMapping("/tasks/delete/{taskId}")
//    public String deleteTask(@PathVariable Long taskId) {
//
//    }


}