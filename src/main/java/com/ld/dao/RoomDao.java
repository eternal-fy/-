package com.ld.dao;

import com.ld.pojo.Room;
import org.springframework.stereotype.Component;

import java.util.List;


public interface RoomDao {
    public List<Room> getRooms();
    public List<Integer> getFreeRooms();
    public void changePosition(int id);
    public double getPriceByRoomid(int id);
}
