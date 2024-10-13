package Assignment_12;

import java.util.Date;

 class BedRoom extends Room{
    private int numBed;

    public BedRoom(String RoomId, String RoomClass, Date checkIn, Date checkOut) {
        super(RoomId, RoomClass, checkIn, checkOut);
        this.numBed=numBed;
    }
}
