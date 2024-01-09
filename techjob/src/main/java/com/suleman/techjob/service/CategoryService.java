package com.suleman.techjob.service;

import com.suleman.techjob.Exceptions.InformationExistException;
import com.suleman.techjob.Exceptions.InformationNotFoundException;
import com.suleman.techjob.model.Category;
import com.suleman.techjob.model.Job;
import com.suleman.techjob.repository.CategoryRepository;
import com.suleman.techjob.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;
    private JobRepository jobRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository, JobRepository jobRepository) {
        this.categoryRepository = categoryRepository;
        this.jobRepository = jobRepository;
    }


    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }


    public Category createCategory(Category categoryObject){

        Category category = categoryRepository.findByName(categoryObject.getName());
        if(category != null){
            throw new InformationExistException("category with name " + category.getName() + " already exists");
        } else{
            return categoryRepository.save(categoryObject);
        }
    }

    public Optional<Category> getCategory(Long categoryId){

        Optional<Category> category = categoryRepository.findById(categoryId);
        if(category.isPresent()){
            return category;
        } else{
            throw new InformationNotFoundException("category with Id " + categoryId + " not found");
        }

    }

    public Optional<Category> getCategory( String categoryName){

        Optional<Category> category = Optional.ofNullable(categoryRepository.findByName(categoryName));
        if(category.isPresent()){
            return category;
        } else{
            throw new InformationNotFoundException("category " + categoryName + " not found");
        }

    }

    public Category updateCategory(Long categoryId, Category categoryObject){

        Optional<Category> category = categoryRepository.findById(categoryId);
        if(category.isPresent()){
            Category updateCategory = categoryRepository.findById(categoryId).get();
            updateCategory.setName(categoryObject.getName());
            return categoryRepository.save(updateCategory);
        } else{
            throw new InformationNotFoundException("category with id " + categoryId + " not found");
        }

    }

    public Optional<Category> deleteCategory(Long categoryId){

        Optional<Category> category = categoryRepository.findById(categoryId);
        if(category.isPresent()){
            categoryRepository.deleteById(categoryId);
            return category;
        } else{
            throw new InformationNotFoundException("category with id " + categoryId +" not found");
        }
    }



}
