public class EmulatorSteam {
    static Steam steam = new Steam();
    static Player player = new Player();

    public static void main(String[] args) throws Exception {
        init();
        displayPlayerInfo();
        displaySteamInfo();
        int numberOfTheGamePlayerWantsToBuy = 5;
        steam.sell(steam.libraryGames[numberOfTheGamePlayerWantsToBuy].name, numberOfTheGamePlayerWantsToBuy, player);
        displayPlayerInfo();
        displaySteamInfo();

    }

    static void displayPlayerInfo() {
        System.out.println("-----------------------------------");
        System.out.println("          About player");
        System.out.println("Nickname: " + player.nickname);
        System.out.println("Age: " + player.age);
        System.out.println("Cash: " + player.cash);
        System.out.println("-----------------------------------");
        System.out.println();
    }

    static void displaySteamInfo() {
        System.out.println("-----------------------------------");
        System.out.println("          About steam");
        System.out.println("Total cash: " + steam.totalCash);
        System.out.println("-----------------------------------");
        System.out.println();
    }


    public static void init() {
        Game[] game = steam.libraryGames;
        game[0] = new Game();
        game[0].name = "W.O.T.";
        game[0].cost = 17.5;
        game[0].ageLimit = 12;


        game[1] = new Game();
        game[1].name = "C.S.: GO";
        game[1].cost = 25.0;
        game[1].ageLimit = 18;


        game[2] = new Game();
        game[2].name = "Barbie World";
        game[2].cost = 5.4;
        game[2].ageLimit = 14;


        game[3] = new Game();
        game[3].name = "Tower Defence";
        game[3].cost = 7.6;
        game[3].ageLimit = 12;


        game[4] = new Game();
        game[4].name = "Detroit become Human";
        game[4].cost = 23.4;
        game[4].ageLimit = 16;


        game[5] = new Game();
        game[5].name = "Tomb Raider";
        game[5].cost = 14.8;
        game[5].ageLimit = 14;


        game[6] = new Game();
        game[6].name = "Watch Dogs";
        game[6].cost = 12.0;
        game[6].ageLimit = 16;


        game[7] = new Game();
        game[7].name = "Half-Life";
        game[7].cost = 18.0;
        game[7].ageLimit = 18;


        game[8] = new Game();
        game[8].name = "GTA";
        game[8].cost = 13.4;
        game[8].ageLimit = 8;


        game[9] = new Game();
        game[9].name = "Harry Potter: Adventure Begins";
        game[9].cost = 8.0;
        game[9].ageLimit = 10;


        player.nickname = "Kukushka";
        player.age = 12;
        player.cash = 90;

    }
}
