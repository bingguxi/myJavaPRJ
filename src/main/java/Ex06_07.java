public class Ex06_07 {
    public static void main(String[] args) {
        int hap = 0; //원래는 int hap;인데 에러 떠서 잠시 바꿨엉
        int i;

        for (i = 1; i <= 10; i++) {
            hap = hap + i;
        }

        System.out.printf(" 1에서 10까지의 합: %d \n", hap);
    }
}
