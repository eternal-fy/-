package com.ld.controller;

import com.ld.pojo.Administrator;
import com.ld.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class AdministratorController {
    @Autowired
    AdministratorService administratorService;
    @RequestMapping("/addAdministrator")
    public String addAdministrator(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        int priority = Integer.parseInt(request.getParameter("priority"));
        Administrator administrator = new Administrator(name, age, priority);
        administratorService.addAdministrator(administrator);
        return "redirect:person.html";

    }

    @RequestMapping("/getAdministrators")
    @ResponseBody
    public List<Administrator> getAdministrators() {
        List<Administrator> administrators = administratorService.getAdministrators();
        return administrators;

    }
}
