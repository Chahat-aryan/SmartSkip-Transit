public class Passenger {
    private String cardId;
    private String entryStation;
    private String destinationStation;

    public Passenger(String cardId, String entryStation, String destinationStation) {
        this.cardId = cardId;
        this.entryStation = entryStation;
        this.destinationStation = destinationStation;
    }

    public String getDestinationStation() {
        return this.destinationStation;
    }

    public String getCardId() {
        return this.cardId;
    }
}