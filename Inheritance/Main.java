public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bycycle cycle = new Bycycle();
        car.go();
        cycle.stop();

        System.out.println(car.speed + " km/hr");
        System.out.println(cycle.speed + " m/sec");
    }
}