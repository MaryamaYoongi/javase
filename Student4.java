import java.text.MessageFormat;

public class Student4 {
    String name;
    String surname;
    String email;
    int form;

    @Override
    public String toString() {
        return MessageFormat.format(" Name: {0}\n Surname: {1}\n Class: {2} \n Email: {3}", name, surname, form, email);
    }
}
