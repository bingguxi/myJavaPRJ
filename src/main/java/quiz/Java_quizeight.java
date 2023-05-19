package quiz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Java_quizeight {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(); // 데이터타입을 정수로 지정한 연결리스트 생성
        Scanner s = new Scanner(System.in); // 값을 입력받을 스캐너 생성

        for (int i = 0; i < 5; i++) // 입력 받은 값을 리스트에 저장하는 for 문
            list.add(s.nextInt());

//        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < 5; i++) // 리스트를 내림차순으로 정렬하는 for 문
        {
            for(int j = i + 1; j < 5; j++)
            {
                if (list.get(i) < list.get(j))
                {
                    int blank = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, blank);
                }
            }
        }
//        for (int i = 0; i < 5; i++) // 1세대 반복문
//        {
//            System.out.printf("%d ", list.get(i));
//        }

//        for (Integer num : list) // 2세대 반복문
//        {
//            System.out.printf("%d ", num);
//        }
        list.forEach(num -> System.out.printf("%d ", num)); // 3세대 반복문
    }
}