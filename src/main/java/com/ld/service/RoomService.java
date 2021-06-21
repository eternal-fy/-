package com.ld.service;

import com.ld.pojo.Room;

import java.util.List;

public interface RoomService {
    public List<Room> getRooms();
    public List<Integer> getFreeRooms();
    public void changePosition(int id);
    public double getPriceByRoomid(int id);

}
