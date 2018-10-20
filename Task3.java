public class Task3 {
    public static void main(String[] args) {
        int[][] marks = {{6, 8, 4, 8, 9, 10, 7, 10, 8, 6, 9, 7, 6, 9, 6, 9},
                        {6, 9, 5, 8, 6, 9, 7, 10, 7, 8, 6, 8, 5, 8, 6, 10},
                        {7, 9, 8, 9, 7, 6, 9, 6, 10, 7, 9, 10, 5, 9, 8, 8},
                        {6, 5, 7, 8, 9, 8, 7, 9, 8, 10, 8, 9, 10, 9, 6, 9}};


         for(int i =1; i <= 16; i++) {
             System.out.println("First semester: " + marks[0][i]);
             System.out.println("Second semester: " + marks[1][i]);
             System.out.println("Third semester: " + marks[2][i]);
             System.out.println("Fourth semester: " + marks[3][i] + "\n");
         }
    }
}
