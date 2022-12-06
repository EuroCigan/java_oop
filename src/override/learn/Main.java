package override.learn;

public class Main {
    public static void main(String[] args) {
        Station_1 station_1 = new Station_1();
        station_1.print();

        Station_1 direction = new Direction();
        direction.print();

        Station_1 station_2 = new Station_2();
        station_2.print();

        Station_1 direction_2 = new Direction();
        direction_2.print();

        Station_1 station_3 = new Station_3();
        station_3.print();

        Station_1 direction_3 = new Direction();
        direction_3.print();

        Station_1 station_return = new Station_1();
        station_return.print();

        Station_1 back = new Direction();
        ((Direction) back).printCongratulations();
    }
}
