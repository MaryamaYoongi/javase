import java.text.MessageFormat;

public class Player2 {
    String nickname;
    String email;
    double winrate;
    int rating;
    String dateLastGame;

    @Override
    public String toString() {
        return MessageFormat.format(" Nickname: {0}\n Email: {1}\n Winrate: {2}\n Rating: {3}\n Date last game: {4}\n", nickname, email, winrate, rating, dateLastGame);
    }
}
