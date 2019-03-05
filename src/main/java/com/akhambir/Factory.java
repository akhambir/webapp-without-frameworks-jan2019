package com.akhambir;

import com.akhambir.controller.GetAllCategoriesController;
import com.akhambir.controller.GetCategoryByIdController;
import com.akhambir.controller.LoginUserController;
import com.akhambir.dao.CategoryDao;
import com.akhambir.dao.CategoryDaoImpl;
import com.akhambir.dao.UserDao;
import com.akhambir.dao.UserDaoImpl;
import com.akhambir.service.CategoryService;
import com.akhambir.service.CategoryServiceImpl;
import com.akhambir.service.UserService;
import com.akhambir.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Factory {

    private static Connection connection;

    static {
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/jv-jan-2019", "sa", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

    public static LoginUserController getLoginUserController(UserService userService) {
        return new LoginUserController(userService);
    }

    public static UserService getUserServiceImpl(UserDao userDao) {
        return new UserServiceImpl(userDao);
    }

    public static UserDao getUserDaoImpl(Connection connection) {
        return new UserDaoImpl(connection);
    }

    public static GetAllCategoriesController getGetAllCategoriesController(CategoryService categoryService) {
        return new GetAllCategoriesController(categoryService);
    }

    public static CategoryService getCategoryService(CategoryDao categoryDao) {
        return new CategoryServiceImpl(categoryDao);
    }

    public static CategoryDao getCategoryDao(Connection connection) {
        return new CategoryDaoImpl(connection);
    }

    public static GetCategoryByIdController getGetCategoryByIdController(CategoryService categoryService) {
        return new GetCategoryByIdController(categoryService);
    }
}
