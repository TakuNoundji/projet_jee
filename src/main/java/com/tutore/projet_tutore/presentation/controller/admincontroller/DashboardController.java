package com.tutore.projet_tutore.presentation.controller.admincontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DashboardController {

    @GetMapping("/admin")
    public String admin(){

        return "administration";
    }
    @GetMapping("/liste")
    public String liste(){

        return "admin/liste";
    }
}
