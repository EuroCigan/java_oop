package override.learn;


public interface Station {
    void printStationName();
    default void move() {
        printStationName();
        if (this instanceof Station_1) {
            System.out.print("---->");
        }
    }

    default void lastStation() {
        printStationName();
        printCongratulations();
    }
    default void printCongratulations() {
        System.out.print("\nCongratulations, you are back home");
    }
}