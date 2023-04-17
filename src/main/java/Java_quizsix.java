import java.util.Scanner;

public class Java_quizsix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.print("값을 입력하세요 : ");
        for (int i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++)
        {
            for (int j = i + 1; j < 5; j++)
            {
                if (a[i] == a[j])
                {
                    a[j] = 0;
                }
            }
        }
        System.out.print("저장된 값은 ");
        for (int i = 0; i < 5; i++)
        {
            if (a[i] != 0)
            {
                System.out.printf("%d ", a[i]);
            }
        }
        System.out.print("입니다.");
    }
}