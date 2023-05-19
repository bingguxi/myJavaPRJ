package quiz;

import java.util.HashSet;
import java.util.Scanner;

public class Java_quiznine {
    public static void main(String[] args) {
//        List<Integer> list = new LinkedList<>();
//        Scanner s = new Scanner(System.in);
//
//        for (int i = 0; i < 5; i++)
//        {
//            list.add(s.nextInt());
//        }
//
//        for (int i = 0; i < 5; i++)
//        {
//            for (int j = i + 1; j < list.size(); j++)
//            {
//                if (list.get(i) == list.get(j))
//                {
//                    list.remove(j);
//                    j--;
//                }
//            }
//        }
//
//        System.out.print("저장된 값은 ");
//        list.forEach(num -> System.out.printf("%d ", num));
//        System.out.print("입니다.");
        HashSet<Integer> set = new HashSet<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            set.add(s.nextInt());
        }
        System.out.print(set);
    }
}
