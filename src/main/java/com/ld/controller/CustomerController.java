package com.ld.controller;

import com.ld.pojo.Customer;
import com.ld.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "/addCustomer")
    public String addCustomer(HttpServletRequest request, HttpServletResponse response){
        System.out.println("----------");
        String id=request.getParameter("idcard");
        String name = request.getParameter("name");
        String gender1 = request.getParameter("gender");
        int gender =gender1.equals("boy")?1:0;
        int age = Integer.parseInt(request.getParameter("age"));
        String method = request.getParameter("method");
        Customer customer = new Customer(id, name, gender, age, method);
        customerService.addCustomer(customer);
        return "redirect:customer.html";

    }

    @RequestMapping(value = "/getCustomers")
    @ResponseBody
    public List<Customer> getCustomers(){
        return customerService.getCustomers();

    }

}
