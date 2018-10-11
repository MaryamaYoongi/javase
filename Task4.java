public class Task4 {
    public  static void main(String [] args){
        int tyreRadius = 20;
        int encoderDegrees = 700;
        double  tyreLength = 3.14 * tyreRadius;
        double distance = tyreLength * encoderDegrees/360;

        System.out.println("Distance traveled: " + distance);

    }
}
