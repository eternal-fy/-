package com.ld.dao;



import com.ld.pojo.Administrator;

import java.util.List;

public interface AdministratorDao {
    public void addAdministrator(Administrator Administrator);
    public List<Administrator> getAdministrators();
}
