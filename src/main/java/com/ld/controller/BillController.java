package com.ld.controller;

import com.ld.pojo.Bill;
import com.ld.service.BillService;
import com.ld.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class BillController {
    @Autowired
    RoomService roomService;
    @Autowired
    BillService billService;

    @ResponseBody
    @RequestMapping("/getRoomids")
    public List<Integer> getRoomids(){
       return roomService.getFreeRooms();
    }


    @RequestMapping("/addBill")
    @Transactional
    public String addBill(HttpServletRequest request, HttpServletResponse response){
        String idcard = request.getParameter("idcard");
        int roomid=Integer.parseInt(request.getParameter("roomid"));
        String name = request.getParameter("name");
        double price=roomService.getPriceByRoomid(roomid);
        int period=Integer.parseInt(request.getParameter("period"));
        Bill bill = new Bill(idcard, roomid, name, price, period);
        System.out.println("------"+bill);
        billService.addBill(bill);
        roomService.changePosition(roomid);
        return "redirect:host.html";
    }

    @ResponseBody
    @RequestMapping("/getBills")
    public List<Bill> getBills(){
        return billService.getBills();
    }
}
