public class BruceWayne {
    public static void main(String [] args){
        BatMobile batmobile = new BatMobile("BatMobile");
        batmobile.start();
        batmobile.drive(8600);
        batmobile.fly(670);
        batmobile.swim(569);
        batmobile.stop();
        batmobile.shoot(1200);
    }
}
