public class Task3 {
    public static void main(String[] args) {
        double HP = 100;
        int hoursAfterRespawn = 2;
        double regenerationPercentFromCurrentHealth = 50;
        for (int i = 0; i < hoursAfterRespawn; i++) {
            HP += HP * regenerationPercentFromCurrentHealth / 100;
        }
        System.out.println("Health points after respawn: " + HP);
    }
}
