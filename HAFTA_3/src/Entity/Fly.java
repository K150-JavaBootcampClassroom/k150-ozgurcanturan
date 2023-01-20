package Entity;

import java.util.Date;

public abstract class Fly {

    private Date time;
    private Passengers passengers;
    private String from;
    private String destination;
    private Company company;
    private FlyType flyType;

    public Fly(Date time, Passengers passengers, String from, String destination, Company company, FlyType flyType) {
        this.time = time;
        this.passengers = passengers;
        this.from = from;
        this.destination = destination;
        this.company = company;
        this.flyType = flyType;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public FlyType getFlyType() {
        return flyType;
    }

    public void setFlyType(FlyType flyType) {
        this.flyType = flyType;
    }
}
