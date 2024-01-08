package com.suleman.taskmanagement.repository;

import com.suleman.taskmanagement.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {

    List<Task> findByCategoryName(String categoryName);

    List<Task> findByTagsName(String tagName);

    List<Task> findByUserUsernameAndPriority(String username, String priority);

    List<Task> findByDueDateBefore(String dueDate);

    List<Task> findByDueDateAfter(String dueDate);
}
