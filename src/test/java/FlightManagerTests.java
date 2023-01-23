import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTests {
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
    public void before() {
        passenger1 = new Passenger("Keith", 2);
        passenger2 = new Passenger("Mar", 1);
        passenger3 = new Passenger("James", 0);
        passenger4 = new Passenger("Meera", 3);
        pilot1 = new Pilot("Jennifer", Rank.FirstOfficer, "jfk123");
        pilot2 = new Pilot("Ben", Rank.Captain, "jfk124");
        cabinCrewMember1 = new CabinCrewMember("Lexi", Rank.FlightAttendant);
        cabinCrewMember2 = new CabinCrewMember("Kevin", Rank.Purser);
        cabinCrewMember3 = new CabinCrewMember("James", Rank.FlightAttendant);
        plane = new Plane(PlaneType.AIRBUSA320);
        departureTime = Calendar.getInstance().getTime();
        flight = new Flight( plane, "FR756", "EDI", "LDN", departureTime);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
    }
    @Test
    public void canCalculateWeightForBaggageReservation(){
        plane = new Plane(PlaneType.AIRBUSA320);
        departureTime = Calendar.getInstance().getTime();
        flight = new Flight( plane, "FR756", "EDI", "LDN", departureTime);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
        assertEquals(5, FlightManager.CalculateWeightForBaggageReservation(flight));
    }
    @Test
    public void canCalculateWeightOfBagsPerPersonThatAircraftCanTake(){
        plane = new Plane(PlaneType.AIRBUSA320);
        departureTime = Calendar.getInstance().getTime();
        flight = new Flight( plane, "FR756", "EDI", "LDN", departureTime);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
        assertEquals(1, FlightManager.weightOfBagsPerPerson(flight),0.01);
    }
    @Test
    public void canCalculateWeightOfPassengerBags(){
        passenger1 = new Passenger("Keith", 2);
        passenger2 = new Passenger("Mar", 1);
        passenger3 = new Passenger("James", 0);
        passenger4 = new Passenger("Meera", 3);
        plane = new Plane(PlaneType.AIRBUSA320);
        departureTime = Calendar.getInstance().getTime();
        flight = new Flight( plane, "FR756", "EDI", "LDN", departureTime);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
        assertEquals(3, FlightManager.weightOfPassengerBags(flight),0.01);
    }
    @Test
    public void canCalculateWeightLeftForBags(){
        passenger1 = new Passenger("Keith", 2);
        passenger2 = new Passenger("Mar", 1);
        passenger3 = new Passenger("James", 0);
        plane = new Plane(PlaneType.AIRBUSA320);
        departureTime = Calendar.getInstance().getTime();
        flight = new Flight( plane, "FR756", "EDI", "LDN", departureTime);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
        assertEquals(2, FlightManager.weightLeftForBags(flight),0.01);
    }
    @Test
    public void wontAddPassengerBagsIfInsufficientSpace(){
        passenger1 = new Passenger("Keith", 2);
        passenger2 = new Passenger("Mar", 1);
        passenger3 = new Passenger("James", 0);
        passenger4 = new Passenger("Meera", 3);
        plane = new Plane(PlaneType.AIRBUSA320);
        departureTime = Calendar.getInstance().getTime();
        flight = new Flight( plane, "FR756", "EDI", "LDN", departureTime);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        flight.addCabinCrewMember(cabinCrewMember3);
        assertEquals(2, FlightManager.weightLeftForBags(flight),0.01);
    }

}
