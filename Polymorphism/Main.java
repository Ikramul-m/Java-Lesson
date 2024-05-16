public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Boat boat = new Boat();

        Vehicle[] race = { car, boat };

        for (Vehicle x : race) {
            x.go();
        }
    }

}