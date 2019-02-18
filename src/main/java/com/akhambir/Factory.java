package com.akhambir;

import com.akhambir.controller.LoginPageController;

public class Factory {

    public static LoginPageController getLoginPageController() {
        return new LoginPageController();
    }

}
