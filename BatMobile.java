public class BatMobile extends Car {
    public BatMobile(String name) {
        super(name);
    }

    public void shoot(int spentBullets) {
        System.out.println(this.name + " used " + spentBullets + " bullets.");
    }

    public void fly(int airDistance) {
        System.out.println(this.name + " has flown " + airDistance + " metres.");
    }

    public void swim(int waterDistance) {
        System.out.println(this.name + " has swum " + waterDistance + " metres.");
    }

    @Override
    public void start() {
        System.out.println(this.name + " is on! Bruce Wayne where are we going?");
    }

    @Override
    public void stop() {
        System.out.println(this.name + " is off! How was our trip?");
    }

    @Override
    public void drive(int groundDistance) {
        System.out.println(this.name + " the coolest car ever! It can drive, swim, fly and shoot!");
        System.out.println(this.name + " has driven " + groundDistance + " metres.");
    }
}