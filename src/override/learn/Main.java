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
        Station_1 station_1 = new Station_1();
        station_1.print();

        Main printDirection = new Main();
        printDirection.printDirection();

        Station_1 station_2 = new Station_2();
        station_2.print();

        printDirection.printDirection();

        Station_1 station_3 = new Station_3();
        station_3.print();

        printDirection.printDirection();

        station_1.print();

        printDirection.printHome();

    }
}
