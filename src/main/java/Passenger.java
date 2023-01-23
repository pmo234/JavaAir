import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Passenger {
    private String name;
    private int numberOfBags;
    private String flightNumber;
    private int seatNumber;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.flightNumber = new String();
        this.seatNumber = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber(Flight flight) {
        setFlightNumber(flight.getFlightNumber());
        return this.flightNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }



    public double getSeatNumber(Flight flight) {
        return this.seatNumber;

    }
}
//        ArrayList<Passenger> passengers = flight.getPassengers();
//        ArrayList<Integer> seatNumbers = new ArrayList<Integer>();
//        ArrayList<Integer> allSeats = new ArrayList<Integer>();
//        int count = 0;
//        while (allSeats.size()<flight.getPlane().getPlaneCapacity()){
//            count +=1;
//            allSeats.add(count);
//        }
//        for (Passenger passenger:passengers){
//            for (int seat:allSeats) {
//                    System.out.println(seat);
//                    System.out.println(passenger.flightNumber);
//                if (passenger.seatNumber == seat) {
//                    allSeats.remove(Integer.valueOf(passenger.seatNumber));
//                }
//            }
//
//        }
//            Random generator = new Random();
//            int randomIndex = generator.nextInt(allSeats.size());
//            allSeats.get(randomIndex);
//            setSeatNumber(flight.numberOfAvailableSeats(), flight);
//            return Math.floor(Math.random() * (this.seatNumber + 1));
