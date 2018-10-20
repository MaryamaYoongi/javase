public class Task2 {
    public static void main(String[] args) {
        int pointsForFirstGamer = 0;
        int pointsForSecondGamer = 0;
        int countKillTanksFirstGamer = 13;
        int countKillTanksSecongGamer = 89;


        for (int i = 1; i <= countKillTanksFirstGamer; i++) {
            pointsForFirstGamer = pointsForFirstGamer + 100;
        }


        for (int i = 1; i <= countKillTanksSecongGamer; i++) {
            pointsForSecondGamer = pointsForSecondGamer + 100;
        }

        if (countKillTanksFirstGamer < countKillTanksSecongGamer) {
            pointsForSecondGamer = pointsForSecondGamer + 1000;
            System.out.println(" Second player won!!!\n Points for the Second gamer before bonus: " + (pointsForSecondGamer - 1000) + "\n Points for the Second gamer at last: " + pointsForSecondGamer);
            System.out.println(" Points for the First player: " + pointsForFirstGamer);
        } else if (countKillTanksFirstGamer > countKillTanksSecongGamer) {
            pointsForFirstGamer = pointsForFirstGamer + 1000;
            System.out.println(" First player won!!!\n Points for the First gamer before bonus: " + (pointsForFirstGamer - 1000) + "\n Points for the First gamer at last: " + pointsForFirstGamer);
            System.out.println(" Points for the Second player: " + pointsForSecondGamer);
        }

        if (countKillTanksFirstGamer == countKillTanksSecongGamer) {
            System.out.println(" Equals!!!");
            System.out.println(" Points for the First player: " + pointsForFirstGamer);
            System.out.println(" Points for the Second player: " + pointsForSecondGamer);

        }
    }
}
