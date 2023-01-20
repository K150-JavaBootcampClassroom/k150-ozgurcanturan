package Entity;

public class Passengers {
    private String nameSurname;
    private Tickets ticket;

    public Passengers(String nameSurname, Tickets ticket) {
        this.nameSurname = nameSurname;
        this.ticket = ticket;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Tickets getTicket() {
        return ticket;
    }

    public void setTicket(Tickets ticket) {
        this.ticket = ticket;
    }
}
