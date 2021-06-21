package com.ld.service;

import com.ld.dao.BillDao;
import com.ld.pojo.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillServiceImp implements BillService {
    @Autowired
    BillDao billDao;
    @Override
    public void addBill(Bill bill) {
        billDao.addBill(bill);
    }

    @Override
    public List<Bill> getBills() {
        return billDao.getBills();
    }
}
