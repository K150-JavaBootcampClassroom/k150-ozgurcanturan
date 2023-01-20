package Entity;

public enum TicketsType {
    ECONOMY("Ekonomi"), BUSINESS("Business");


    private String ticketType;

    TicketsType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getTicketType() {
        return ticketType;
    }
}