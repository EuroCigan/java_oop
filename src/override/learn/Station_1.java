package override.learn;

public class Station_1 implements Station{
    private final static String STATION_NAME = "Kiev";

    @Override
    public void printStationName() {
        System.out.print(STATION_NAME);
    }
}
