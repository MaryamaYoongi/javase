public class Task5 {
    public  static  void  main(String [] args){
        int playingTimeInSeconds=9535;
        int hours =playingTimeInSeconds/3600;
        int minutes= playingTimeInSeconds/60 - hours*60;
        int seconds = playingTimeInSeconds - (minutes * 60 + hours * 3600);
        System.out.printf("You have played %d:%d:%d",hours,minutes,seconds);


    }
}
