package Test01.HotelManagementSystem;

import java.util.Arrays;

public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];
        String type;
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    type = "单人间";
                } else if (i == 1) {
                    type = "双人间";
                } else {
                    type = "豪华间";
                }
                rooms[i][j] = new Room((i + 1) * 100 + j + 1, type);
            }
        }
    }

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }
}
