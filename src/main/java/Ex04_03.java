public class Ex04_03 {
    public static void main(String[] args) {
        int a = 10;

        a++;
        System.out.printf(" a ++ ==> %d \n", a);

        a--;
        System.out.printf(" a -- ==> %d \n", a);

        a += 5; // a = a + 5 와 동일!!!
        System.out.printf(" a += 5 ==> %d \n", a);

        a -= 5; // a = a - 5 와 동일!!!
        System.out.printf(" a -= 5 ==> %d \n", a);

        a *= 5; // a = a * 5 와 동일!!!
        System.out.printf(" a *= 5 ==> %d \n", a);

        a /= 5; // a = a/ 5 와 동일!!!
        System.out.printf(" a /= 5 ==> %d \n", a);

        a %= 5; // a = a % 5 와 동일!!!
        System.out.printf(" a %%= 5 ==> %d \n", a);
    }
}