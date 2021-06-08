package com.bandilasalmongo.demo.service;

import com.bandilasalmongo.demo.model.Category;
import com.bandilasalmongo.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public Double getCalculatedPrice(String id) {

      Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            return category.get().getPrice();
        } else {
            return 0.0;
        }

    }


}
