package com.example.practicacasa.handlers;

import com.example.practicacasa.dtos.request.RoomDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class HouseHandler {

    static final double VALUE_M2 = 800;

    public static float getSizeHouse(List<RoomDto> listRooms) {
        float totalSize = 0;
        for (RoomDto room: listRooms) {
            totalSize = totalSize + room.getArea();
        }
        return totalSize;
    }

    public static float getValueOfHouse(List<RoomDto> listRoooms) {
        return (float) (getSizeHouse(listRoooms)*VALUE_M2);
    }

    public static String getBiggestRoom(List<RoomDto> listRooms) {
        listRooms.sort(
                    Comparator.comparing(RoomDto::getArea).reversed()
            );
        System.out.println(listRooms.toString());
        return listRooms.get(0).getNameRoom();
    }

    public static List<Map<String, Object>> getRooms(List<RoomDto> listRooms) {
        List<Map<String, Object>> listRoomsSize = new ArrayList<>();
        for (RoomDto room: listRooms) {
                listRoomsSize.add(Map.of("name", room.getNameRoom(), "area", room.getArea()));
        }
        return listRoomsSize;
    }

}
