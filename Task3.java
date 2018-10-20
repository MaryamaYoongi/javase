public class Task3 {
    public static void main(String[] args) {
        double HP = 75.0;
        if (0 <= HP && HP < 25) {
            System.out.println("Red");
        } else if (25 <= HP && HP < 50) {
            System.out.println("Orange");
        } else if (50 <= HP && HP < 75) {
            System.out.println("Yellow");
        } else if (75 <= HP && HP <= 100) {
            System.out.println("Green");
        }
    }
}
