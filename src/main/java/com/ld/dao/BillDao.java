package com.ld.dao;

import com.ld.pojo.Bill;

import java.util.List;

public interface BillDao {
    public void addBill(Bill bill);
    public List<Bill> getBills();
}
