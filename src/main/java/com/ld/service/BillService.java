package com.ld.service;

import com.ld.pojo.Bill;

import java.util.List;

public interface BillService {
    public void addBill(Bill bill);
    public List<Bill> getBills();
}
