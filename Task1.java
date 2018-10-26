public class Task1 {
    public static void main(String[] args) {
        int amountOfTopPlayers = 5;
        String topGamer[] = new String[amountOfTopPlayers];

        for (int i = 0; i < amountOfTopPlayers; i++) {
            topGamer[i] = ("User" + i);
        }

        for (int i = 0; i < amountOfTopPlayers; i++) {
            System.out.println("Congratulations " + topGamer[i] + "! You are in TOP-3 now :)");
        }
    }
}
