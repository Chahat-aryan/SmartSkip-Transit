
public class MetroControlSystem {

    public void evaluateUpcomingStation(Train train, Station station) {
        int alightingCount = train.getAlightingCount(station.getStationId());
        int boardingCount = station.getPlatformWaitingCount();
        System.out.println("\n------------------------------------------------");
        System.out.println("Train ID: " + train.getTrainId() + " approaching Station: " + station.getStationName());
        System.out.println("-> Passengers Getting Off (Alighting): " + alightingCount);
        System.out.println("-> Passengers Waiting on Platform (Boarding): " + boardingCount);
        if (alightingCount == 0 && boardingCount == 0) {
            System.out.println(">>> DECISION: SKIP STATION!");
            System.out.println(">>> Action: Maintain cruising speed to save time and energy.");
        } else {
            System.out.println(">>> DECISION: STOP AT STATION!");
            System.out.println(">>> Action: Slow down, open doors, and handle passengers.");
        }
        System.out.println("------------------------------------------------");
    }
}