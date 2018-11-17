public class Car {
    public String name;

    public Car(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println(this.name + " is on!");
    }

    public void stop() {
        System.out.println(this.name + " is off!");
    }

    public void drive(int distance) {
        System.out.println("The " + this.name + " has driven " + distance + " meters.");
    }
}
