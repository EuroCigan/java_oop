package override.learn;

public class Station_2 extends Station_1 {
    private final static String STATION_NAME = "Paris";

    @Override
    public void printStationName() {
        System.out.print(STATION_NAME);
    }
}
