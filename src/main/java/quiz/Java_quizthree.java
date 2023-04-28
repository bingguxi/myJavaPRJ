package quiz;

public class Java_quizthree {
    public static void main(String[] args) {
        int i, j;

        for (i = 1, j = 2; i < 6; i++)
        {
            if (j < 7)
            {
                System.out.print("*");
            }
            if (i == j-1)
            {
                System.out.println();
                j++;
                i = 0;
            }
        }
    }
}