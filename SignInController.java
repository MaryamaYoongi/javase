package signin;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SignInController {
    @FXML
    private TextField name;
    @FXML
    private TextField pass;
    @FXML
    private Label errMsg;

    private boolean LOCK_CONTEXT = false;
    SimpleStringProperty signinError = new SimpleStringProperty();

    private final Player player[] = new Player[10];


    @FXML
    public void initialize() {
        System.out.println("Controller is ready to work!!!");
        errMsg.textProperty().bind(signinError);
    }

    private void post() {
        player[0] = new Player("Ivan");
        player[0] = new Player("Ivan");
        player[0] = new Player("Ivan");
        player[0] = new Player("Ivan");
        player[0] = new Player("Ivan");
        player[0] = new Player("Ivan");
        player[0] = new Player("Ivan");
        player[0] = new Player("Ivan");
        player[0] = new Player("Ivan");

    }


    @FXML
    public void signInIsClicked() {
        if (!LOCK_CONTEXT) {
            post();
            LOCK_CONTEXT = true;
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("The button *Sign In* was clicked.");
        for (int i = 0; i < 10; i++) {
            if (!player[i].name.equals(name)) {
                errMsg.setText("Wrong ID!!!");
                System.out.println("Got user name: " + name + ". Got password: " + pass + ".");
            } else {
                errMsg.setText("You signed in successfully");
            }
        }
        System.out.println("---------------------------------------------------------");

    }
}
