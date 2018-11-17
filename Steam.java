public class Steam {
    Game[] libraryGames = new Game[10];
    double totalCash;

    public void sell(String titleGame, int numberOfTheGame, Player player) throws  Exception{
        //     Game sellGame = findGame(titleGame);
        //      if (sellGame != null) {}
            if (player.age < libraryGames[numberOfTheGame].ageLimit) {
                throw new Exception("Age limit!");
            }

            if (player.cash < libraryGames[numberOfTheGame].cost) {
                    throw new Exception("You don't have enough money.");
                }
       player.cash-=libraryGames[numberOfTheGame].cost;
        //add into library
        totalCash+=libraryGames[numberOfTheGame].cost;
        System.out.println("**************************************************************************************************************");
        System.out.println("Player "+player.nickname+" has bought game *"+libraryGames[numberOfTheGame].name+"* successfully!");
        System.out.println("**************************************************************************************************************");

    }

  //        private Game findGame(String titleGame){
  //            for (int i = 0; i < libraryGames.length; i++) {
  //
  //          }
  //          return null;
}