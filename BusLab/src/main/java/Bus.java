import java.util.ArrayList;

public class Bus {

    private String Destination;
    private int Capacity;
    private ArrayList<Passenger> passengerList;

    public Bus(String Destination, int Capacity) {
        this.Destination = Destination;
        this.Capacity = Capacity;
        this.passengerList = new ArrayList<>();
    }


    public int getPassengers() {
        return this.passengerList.size();
    }

    public void add_passenger(Passenger passenger) {
        this.passengerList.add(passenger);
    }

    public boolean check_capacity() {
        return this.Capacity >= getPassengers();
    }

    public void remove_passenger(Passenger passenger1) {
        this.passengerList.remove(0);
    }
}

