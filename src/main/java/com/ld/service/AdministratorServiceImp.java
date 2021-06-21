package com.ld.service;

import com.ld.dao.AdministratorDao;
import com.ld.pojo.Administrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdministratorServiceImp implements AdministratorService {
    @Autowired
    AdministratorDao administratorDao;
    @Override
    public void addAdministrator(Administrator administrator) {
        administratorDao.addAdministrator(administrator);
    }

    @Override
    public List<Administrator> getAdministrators() {
        return administratorDao.getAdministrators();
    }
}
