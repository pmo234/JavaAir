import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTests {
    Flight flight;
    Pilot pilot1;
    Pilot pilot2;
    ArrayList<Pilot> pilots;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    CabinCrewMember cabinCrewMember3;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    ArrayList<Passenger> passengers;
    Plane plane;
    Date departureTime;
    @Before
    public void before() throws ParseException {
        passenger1 = new Passenger("Keith",2);
        passenger2 = new Passenger("Mar",1);
        passenger3 = new Passenger("James",0);
        passenger4 = new Passenger("Meera",3);
        pilot1 = new Pilot("Jennifer",Rank.FirstOfficer, "jfk123");
        pilot2 = new Pilot("Ben",Rank.Captain, "jfk124");
        cabinCrewMember1 = new CabinCrewMember("Lexi",Rank.FlightAttendant);
        cabinCrewMember2 = new CabinCrewMember("Kevin",Rank.Purser);
        cabinCrewMember3 = new CabinCrewMember("James",Rank.FlightAttendant);
        plane = new Plane(PlaneType.AIRBUSA320);
        departureTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-01 07:30:00");
        flight = new Flight(plane,"FR756","EDI","LDN",departureTime);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
    }
    @Test
    public void flightHasANumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }
    @Test
    public void flightHasADestination() {
        assertEquals("EDI", flight.getDestination());
    }
    @Test
    public void flightHasADepartureAirport() {
        assertEquals("LDN", flight.getDepartureAirport());
    }
    @Test
    public void flightHasADepartureTime() throws ParseException {
        assertEquals(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-01 07:30:00")
, flight.getDepartureTime());
    }
    @Test
    public void flightHas2Pilots() {
        assertEquals(2, flight.numberOfPilots());
    }
    @Test
    public void flightHas3CrewMembers() {

        assertEquals(3, flight.numberOfCrewMembers());
    }
    @Test
    public void flightCanTakePassengers() {
        flight.addPassenger(passenger1);

        assertEquals(1, flight.numberOfPassengers());
    }
    @Test
    public void flightCanReturnTheNumberOfAvailableSeats() {
        flight.addPassenger(passenger1);

        assertEquals(4, flight.numberOfAvailableSeats());
    }
    @Test
    public void flightCanAddPassengerOnlyIfThereAreAvailableSeats() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);

        assertEquals(5, flight.numberOfPassengers());
    }

}


