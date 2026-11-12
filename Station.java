public class Station {
    private String stationId;
    private String stationName;
    private int platformWaitingCount;

    public Station(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.platformWaitingCount = 0;
    }

    public void setPlatformWaitingCount(int count) {
        this.platformWaitingCount = count;
    }

    public String getStationId() {
        return this.stationId;
    }

    public String getStationName() {
        return this.stationName;
    }

    public int getPlatformWaitingCount() {
        return this.platformWaitingCount;
    }
}