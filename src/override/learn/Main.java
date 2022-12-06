package override.learn;

public class Main {
    public static void main(String[] args) {
        Station station = new Station_1();
        station.move();

        station = new Station_2();
        station.move();

        station = new Station_3();
        station.move();

        station = new Station_1();
        station.move();

        station.printCongratulations();
    }
}
