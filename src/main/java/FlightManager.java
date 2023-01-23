import java.util.ArrayList;

public class FlightManager {


    public static int CalculateWeightForBaggageReservation(Flight flight) {
        return flight.getPlane().getPlaneWeight()/2;
    }

    public static double weightOfBagsPerPerson(Flight flight) {
        return CalculateWeightForBaggageReservation(flight)/flight.getPlane().getPlaneCapacity();
    }

    public static double weightOfPassengerBags(Flight flight) {
        ArrayList<Passenger> passengers = flight.getPassengers();
        int totalWeight = 0;
            for (Passenger passenger:passengers){
                if(totalWeight+passenger.getNumberOfBags()<CalculateWeightForBaggageReservation(flight)){
                    totalWeight+=passenger.getNumberOfBags();}

            }
        return totalWeight;
    }

    public static double weightLeftForBags(Flight flight) {
        return CalculateWeightForBaggageReservation(flight)-weightOfPassengerBags(flight);
    }
//    public static void
}
