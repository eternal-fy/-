package com.ld.pojo;

public class Bill {
    private int id;
    private String customerid;
    private int roomid;
    private String customerName;
    private double price;
    private int period;

    public Bill() {
    }

    public Bill(String customerid, int roomid, String customerName, double price, int period) {
        this.customerid = customerid;
        this.roomid = roomid;
        this.customerName = customerName;
        this.price = price;
        this.period = period;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", customerid='" + customerid + '\'' +
                ", roomid=" + roomid +
                ", customerName='" + customerName + '\'' +
                ", price=" + price +
                ", period=" + period +
                '}';
    }
}
