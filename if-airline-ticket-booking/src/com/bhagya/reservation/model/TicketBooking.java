package com.bhagya.reservation.model;

public class TicketBooking {

    private String seatPreference;
    private String Destination;
    private int PassportNo;
    private String AddMeal;
    private double TicketAmount;

    @Override
    public String toString() {
        return "TcketBooking{" +
                "seatPreference='" + seatPreference + '\'' +
                ", Destination='" + Destination + '\'' +
                ", PassportNo=" + PassportNo +
                ", AddMeal='" + AddMeal + '\'' +
                ", TicketAmount=" + TicketAmount +
                '}';
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getPassportNo() {
        return PassportNo;
    }

    public void setPassportNo(int passportNo) {
        PassportNo = passportNo;
    }

    public String getAddMeal() {
        return AddMeal;
    }

    public void setAddMeal(String addMeal) {
        AddMeal = addMeal;
    }

    public double getTicketAmount() {
        return TicketAmount;
    }

    public void setTicketAmount(double ticketAmount) {
        TicketAmount = ticketAmount;
    }
}
