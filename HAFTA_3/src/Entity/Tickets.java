package Entity;

import java.util.Date;

public class Tickets extends Fly {
    private int id;
    private Seats seat;


    public Tickets(Date time, Passengers passengers, String from, String destination, Company company, FlyType flyType) {
        super(time, passengers, from, destination, company, flyType);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seats getSeat() {
        return seat;
    }

    public void setSeat(Seats seat) {
        this.seat = seat;
    }
}

