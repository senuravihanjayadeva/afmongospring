package com.bandilasalmongo.demo.repository;

import com.bandilasalmongo.demo.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category,String> {
}
