package com.ld.dao;

import com.ld.pojo.Customer;

import java.util.List;

public interface CustomerDao {
    public void addCustomer(Customer customer);
    public List<Customer> getCustomers();
}
