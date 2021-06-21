package com.ld.service;

import com.ld.pojo.Administrator;

import java.util.List;

public interface AdministratorService {
    public void addAdministrator(Administrator Administrator);
    public List<Administrator> getAdministrators();
}
