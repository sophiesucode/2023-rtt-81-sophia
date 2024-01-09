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

    @Autowired
    private TaskService taskService;

//    @GetMapping("/tasks")
//    public String showTasks(Model model) {
//        // Retrieve tasks from your service or repository
//        List<Task> tasksToDo = taskService.getTasksByColumn("To Do");
//        List<Task> tasksInProgress = taskService.getTasksByColumn("In Progress");
//        List<Task> tasksDone = taskService.getTasksByColumn("Done");
//
//        // Add tasks to the Thymeleaf model
//        model.addAttribute("tasksToDo", tasksToDo);
//        model.addAttribute("tasksInProgress", tasksInProgress);
//        model.addAttribute("tasksDone", tasksDone);
//
//        return "tasks";
//}


//    @GetMapping("/tasks")
//    public String showTasks(@ModelAttribute("newTask") Task newTask, Model model) {
//        // Retrieve tasks from your service or repository
//        List<Task> tasksToDo = taskService.getTasksByColumn("To Do");
//        List<Task> tasksInProgress = taskService.getTasksByColumn("In Progress");
//        List<Task> tasksDone = taskService.getTasksByColumn("Done");
//
//        // Add tasks to the Thymeleaf model
//        model.addAttribute("tasksToDo", tasksToDo);
//        model.addAttribute("tasksInProgress", tasksInProgress);
//        model.addAttribute("tasksDone", tasksDone);
//
//        // Add a new task object to the model for the form
//        model.addAttribute("task", new Task());
//
//        return "tasks";
//    }

    //    @PostMapping("/tasks/create")
//    public ResponseEntity<Task> createTask(@RequestBody Task task) {
//        Task createdTask = taskService.createTask(task);
//        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
//    }
//    @PostMapping("/tasks/create")
//    public String createTask(@ModelAttribute("newTask") @Valid Task task, BindingResult result) {
//        if (result.hasErrors()) {
//            // Handle validation errors, return to the tasks page with an error message
//            return "redirect:/tasks?error";
//        }
//
//        taskService.createTask(task);
//
//        // Redirect to the tasks page with a success message
//        return "redirect:/tasks?success";
//    }

    @PostMapping("/tasks/create")
    public String createTask(@ModelAttribute("newTask") @Valid Task task, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "redirect:/tasks?error";
        }

        taskService.createTask(task);

        // Add a temporary success message to the model
        model.addAttribute("successMessage", "Task created successfully!");

        // Redirect to the tasks page (without query parameters)
        return "redirect:/tasks";
    }

    @GetMapping("/tasks")
    public String showTasks(Model model) {
        // Retrieve tasks from your service or repository
        List<Task> tasksToDo = taskService.getTasksByColumn("To Do");
        List<Task> tasksInProgress = taskService.getTasksByColumn("In Progress");
        List<Task> tasksDone = taskService.getTasksByColumn("Done");

        // Add tasks and a new task object to the Thymeleaf model
        model.addAttribute("tasksToDo", tasksToDo);
        model.addAttribute("tasksInProgress", tasksInProgress);
        model.addAttribute("tasksDone", tasksDone);

        // Add a new task object for the form submission
        model.addAttribute("newTask", new Task());

        return "tasks";
    }


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
//        // Handle task update logic
//    }
//
//    @GetMapping("/tasks/delete/{taskId}")
//    public String deleteTask(@PathVariable Long taskId) {
//        // Handle task deletion logic
//    }


}