import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private Date departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, Date departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void addPilot(Pilot pilot) {
        pilots.add(pilot);
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        cabinCrewMembers.add(cabinCrewMember);
    }

    public int numberOfPilots() {
        return this.pilots.size();
    }

    public int numberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if(plane.getPlaneCapacity()-this.numberOfPassengers()>0){
        passengers.add(passenger);

        }
    }

    public void setSeatNumber(Passenger passenger){
        ArrayList<Passenger> allPassengers = getPassengers();
        ArrayList<Integer> allSeats = new ArrayList<Integer>();
        int count = 0;
        while (allSeats.size()<getPlane().getPlaneCapacity()){
            count +=1;
            allSeats.add(count);
        }
    }

    public int numberOfCrewMembers() {
        return this.cabinCrewMembers.size();
    }

    public int numberOfAvailableSeats() {
        return plane.getPlaneCapacity()-this.numberOfPassengers();

        }

    public ArrayList getCabinCrewList() {
        return this.cabinCrewMembers;
    }
}


