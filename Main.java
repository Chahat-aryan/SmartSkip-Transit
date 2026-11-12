public class Main {
    public static void main(String[] args) {
        MetroControlSystem centralBrain = new MetroControlSystem();
        Station stationRajivChowk = new Station("ST01", "Rajiv Chowk");
        Station stationUdyogBhawan = new Station("ST02", "Udyog Bhawan"); // Low footfall test station
        Station stationHauzKhas = new Station("ST03", "Hauz Khas");
        Train train101 = new Train("TR-YELLOW-01");
        train101.boardPassenger(new Passenger("CARD_001", "ST01", "ST03"));
        train101.boardPassenger(new Passenger("CARD_002", "ST01", "ST03"));
        stationUdyogBhawan.setPlatformWaitingCount(0);
        centralBrain.evaluateUpcomingStation(train101, stationUdyogBhawan);
        stationHauzKhas.setPlatformWaitingCount(5);
        centralBrain.evaluateUpcomingStation(train101, stationHauzKhas);
    }
}