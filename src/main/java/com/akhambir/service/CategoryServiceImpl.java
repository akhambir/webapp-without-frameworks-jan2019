package com.akhambir.service;

import com.akhambir.DBEmulator;
import com.akhambir.model.Category;

import java.util.List;
import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<Category> getAll() {
        return DBEmulator.getCategories();
    }

    @Override
    public Optional<Category> getById(Long id) {
        return DBEmulator.getCategories().stream().filter(c -> c.getId().equals(id)).findFirst();
    }
}
