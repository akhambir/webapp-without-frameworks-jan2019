package com.akhambir.controller;

import com.akhambir.Request;
import com.akhambir.ViewModel;


public interface Controller {

    ViewModel process(Request req);

}
