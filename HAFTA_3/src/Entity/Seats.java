package Entity;

import java.util.ArrayList;

public class Seats {
    private String seatId;
    private TicketsType type;
    private boolean isFull = false;
    private ArrayList<Seats> seats;

    public Seats(String seatId, TicketsType type) {
        this.seatId = seatId;
        this.type = type;

        {
            seats=new ArrayList<>();
            seats.add(new Seats("A1",TicketsType.BUSINESS));
            seats.add(new Seats("A2",TicketsType.BUSINESS));
            seats.add(new Seats("A3",TicketsType.ECONOMY));
            seats.add(new Seats("A4",TicketsType.ECONOMY));
            seats.add(new Seats("B1",TicketsType.BUSINESS));
            seats.add(new Seats("B2",TicketsType.BUSINESS));
            seats.add(new Seats("B3",TicketsType.ECONOMY));
            seats.add(new Seats("B4",TicketsType.ECONOMY));
        }
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public TicketsType getType() {
        return type;
    }

    public void setType(TicketsType type) {
        this.type = type;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }
}
