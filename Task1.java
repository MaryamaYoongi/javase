public class Task1 {
    public static void main(String [] args){
        int number = 653;
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int units = number % 10;

        System.out.printf(" Hudreds: %d\n Tens: %d\n Units: %d",hundreds,tens,units);
    }
}
