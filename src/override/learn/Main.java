package override.learn;

public class Main implements Greeting {
    @Override
    public void printDirection() {
        System.out.println(" --> ");
    }
    public void printHome() {
        System.out.println("\nCongratulations, you have arrived home!");

    }
    public static void main(String[] args) {
        Station station_1 = new Station();
        station_1.print();

        Main printDirection = new Main();
        printDirection.printDirection();

        Station station_2 = new Station_2();
        station_2.print();

        printDirection.printDirection();

        Station station_3 = new Station_3();
        station_3.print();

        printDirection.printDirection();

        Station station_return = new Station();
        station_return.print();

        Main printHome = new Main();
        printHome.printHome();

    }
}
