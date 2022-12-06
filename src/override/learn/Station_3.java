package override.learn;

public class Station_3 extends Station_2 {
    private final static String STATION_NAME = "Berlin";

    @Override
    public void printStationName() {
        System.out.print(STATION_NAME);
    }
}
