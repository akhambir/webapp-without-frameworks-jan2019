package com.akhambir.controller;

import com.akhambir.web.Request;
import com.akhambir.web.ViewModel;
import com.akhambir.service.CategoryService;

import static java.util.Collections.emptyList;

public class GetCategoryByIdController implements Controller {

    private final CategoryService categoryService;

    public GetCategoryByIdController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public ViewModel process(Request req) {
        String param = req.getParam("c_id")[0];
        Long id = Long.parseLong(param);
        return categoryService.getById(id)
                .map(c -> ViewModel.of("category").withAttribute("category", c))
                .orElseGet(() -> ViewModel.of("category").withAttribute("category", emptyList()));
    }
}
