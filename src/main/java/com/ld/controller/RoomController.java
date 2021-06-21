package com.ld.controller;

import com.ld.pojo.Room;
import com.ld.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;
    @RequestMapping("/getRooms")
    public List<Room> getRomms(){
     return roomService.getRooms();
    }
}
