package com.fridaynext.cp2077companion.repository;

import com.fridaynext.cp2077companion.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // add custom CRUD functionality for Category objects here

    public Category findByName(String name);
}
