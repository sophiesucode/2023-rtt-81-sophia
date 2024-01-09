package com.suleman.techjob.repository;

import com.suleman.techjob.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findByName(String categoryName);

   List<Category> findAllByName(String name);

  List<Category> findAllById(Long id);
}
