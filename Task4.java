public class Task4 {
    public static void main(String[] args) {
        Student4[] classmates = new Student4[5];
        classmates[0] = new Student4();
        classmates[0].name = "Ivan";
        classmates[0].surname = "Smirnov";
        classmates[0].form = 10;
        classmates[0].email = "uoeyrew@mail.ru";

        classmates[1] = new Student4();
        classmates[1].name = "Nikita";
        classmates[1].surname = "Gamza";
        classmates[1].form = 10;
        classmates[1].email = "kurinevich@gmail.com";

        classmates[2] = new Student4();
        classmates[2].name = "Artem";
        classmates[2].surname = "Vilegjanin";
        classmates[2].form = 10;
        classmates[2].email = "phizik@gmail.com";

        classmates[3] = new Student4();
        classmates[3].name = "Pavel";
        classmates[3].surname = "Yaroshevich";
        classmates[3].form = 10;
        classmates[3].email = "berezeneq@mail.ru";

        classmates[4] = new Student4();
        classmates[4].name = "Gleb";
        classmates[4].surname = "Zagovalski";
        classmates[4].form = 10;
        classmates[4].email = "perevedasi@mail.ru";

        int[] marks = {4, 5, 6, 7, 8, 9, 10};

        for (int i = 1; i <= 5; i++) {
            System.out.println(classmates[i]);
            System.out.println("Mark for the First semester: " + marks[(int) (Math.random() * 7)]);
            System.out.println("Mark for the Second semester: " + marks[(int) (Math.random() * 7)]);
            System.out.println("Mark for the Third semester: " + marks[(int) (Math.random() * 7)]);
            System.out.println("Mark for the Fourth semester: " + marks[(int) (Math.random() * 7)] + "\n");


        }
    }

}
