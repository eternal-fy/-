package com.ld.service;

import com.ld.pojo.Customer;

import java.util.List;

public interface CustomerService {
    public void addCustomer(Customer customer);
    public List<Customer> getCustomers();
}
