import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTests {
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
    public void before(){
        passenger1 = new Passenger("Keith",2);
    }
    @Test
    public void passengerHasAName() {
        assertEquals("Keith", passenger1.getName());
    }
    @Test
    public void passengerHasANumberOfBags() {
        assertEquals(2, passenger1.getNumberOfBags());
    }
    @Test
    public void passengerHasAFlight() {
        passenger1 = new Passenger("Keith", 2);
        plane = new Plane(PlaneType.AIRBUSA320);
        departureTime = Calendar.getInstance().getTime();
        flight = new Flight( plane, "FR756", "EDI", "LDN", departureTime);
        flight.addPassenger(passenger1);

        assertEquals("FR756", passenger1.getFlightNumber(flight));
    }
//    @Test
//    public void passengerHasASeat() {
//        passenger1 = new Passenger("Keith", 2);
//        plane = new Plane(PlaneType.AIRBUSA320);
//        departureTime = Calendar.getInstance().getTime();
//        flight = new Flight( plane, "FR756", "EDI", "LDN", departureTime);
//        flight.addPassenger(passenger1);
//
//        assertEquals(4, passenger1.getSeatNumber(flight),0);
//    }
//    @Test
//    public void passengersHaveDifferentSeats() {
//        passenger1 = new Passenger("Keith", 2);
//        passenger2 = new Passenger("Mar",1);
//        passenger3 = new Passenger("James",0);
//        passenger4 = new Passenger("Meera",3);
//        plane = new Plane(PlaneType.AIRBUSA320);
//        departureTime = Calendar.getInstance().getTime();
//        flight = new Flight( plane, "FR756", "EDI", "LDN", departureTime);
//        flight.addPassenger(passenger1);
//        flight.addPassenger(passenger2);
//        flight.addPassenger(passenger3);
//        flight.addPassenger(passenger4);
//
//        assertEquals(4, passenger1.getSeatNumber(flight),0);
//        assertEquals(4, passenger2.getSeatNumber(flight),0);
//        assertEquals(4, passenger3.getSeatNumber(flight),0);
//        assertEquals(4, passenger4.getSeatNumber(flight),0);
//    }

}
