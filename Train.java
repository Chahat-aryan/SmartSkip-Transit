import java.util.ArrayList;
import java.util.List;

public class Train {
    private String trainId;
    private List<Passenger> onboardPassengers;

    public Train(String trainId) {
        this.trainId = trainId;
        this.onboardPassengers = new ArrayList<>();
    }

    public void boardPassenger(Passenger passenger) {
        this.onboardPassengers.add(passenger);
    }

    public int getAlightingCount(String stationId) {
        int count = 0;
        for (Passenger passenger : this.onboardPassengers) {
            String destinationStation = passenger.getDestinationStation();
            if (destinationStation != null && destinationStation.equalsIgnoreCase(stationId)) {
                count++;
            }
        }
        return count;
    }

    public String getTrainId() {
        return this.trainId;
    }
}