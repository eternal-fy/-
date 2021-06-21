package com.ld.service;

import com.ld.dao.CustomerDao;
import com.ld.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {
    @Autowired
    CustomerDao customerDao;

    @Override
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }
}
