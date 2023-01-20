package Controller;

import Entity.Company;
import Entity.Fly;
import Entity.Passengers;
import Entity.Tickets;

public interface IContoller {
    public void flight(Company company, Fly fly, Tickets tickets, Passengers passengers);

}
