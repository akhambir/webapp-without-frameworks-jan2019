package com.akhambir.controller;

import com.akhambir.Request;
import com.akhambir.ViewModel;

public class LoginPageController implements Controller {

    @Override
    public ViewModel process(Request req) {
        return ViewModel.of("login");
    }
}
