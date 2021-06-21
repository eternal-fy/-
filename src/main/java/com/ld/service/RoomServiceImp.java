package com.ld.service;

import com.ld.dao.RoomDao;
import com.ld.pojo.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImp implements RoomService {
    @Autowired
    RoomDao roomDao;
    @Override
    public List<Room> getRooms() {
        return roomDao.getRooms();
    }

    @Override
    public List<Integer> getFreeRooms() {
        return roomDao.getFreeRooms();
    }

    @Override
    public void changePosition(int id) {
        roomDao.changePosition(id);
    }

    @Override
    public double getPriceByRoomid(int id) {
        return roomDao.getPriceByRoomid(id);
    }
}
