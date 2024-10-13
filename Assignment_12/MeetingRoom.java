package Assignment_12;

import java.util.Date;

class MeetingRoom extends Room{
    private int numChair;

    public MeetingRoom(String RoomId, String RoomClass, Date checkIn, Date checkOut) {
        super(RoomId, RoomClass, checkIn, checkOut);
        this.numChair=numChair;
    }
}
