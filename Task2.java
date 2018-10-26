public class Task2 {
    public static void main(String[] args) {
        int gems = 0;
        int howManyPeople = 11;
        Gamer2 gamer[] = new Gamer2[howManyPeople];
        for (int i = 0; i < howManyPeople; i++) {
            gamer[i] = new Gamer2();
            gamer[i].name = ("User" + i);
            gamer[i].points = (int) (Math.random() * 3000);
            if (gamer[i].points > 1337) {
                System.out.println(gamer[i].name + " earned " + gamer[i].points + " points. Player gets 322 gems)");
                gems += 322;
            }
        }
        System.out.println("Players earned " + gems + " gems during this event!");
    }
}
