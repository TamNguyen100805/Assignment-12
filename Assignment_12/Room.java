package Assignment_12;

import java.util.Date;

abstract class Room implements IRoom {

    protected String RoomId;
    protected String RoomClass;
    protected Date checkIn, checkOut;
    protected double Price;

    public Room(String RoomId, String RoomClass, Date checkIn, Date checkOut) {
        this.RoomId = RoomId;
        this.RoomClass = RoomClass;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public double RentCostCal() {
        int numRentDay = (checkIn.equals(checkOut)) ? 1
                : (int) ((checkOut.getTime() - checkIn.getTime())
                / (1000 * 60 * 60 * 24));
        switch (RoomClass) {
            case "A" -> Price = 1200000;
            case "B" -> Price = 1000000;
            case "C" -> Price = 750000;
        }
        return Price * numRentDay;
    }

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public String getRoomClass() {
        return RoomClass;
    }

    public void setRoomClass(String RoomClass) {
        this.RoomClass = RoomClass;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

}
