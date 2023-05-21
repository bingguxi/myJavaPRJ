public class Ex09_09 {
    public static void main(String[] args) {
        String str1 = "Java Programming"; // ex. 메모리(RAM)의 100번지에 저장됨
        String str2 = "Java Programming"; // ex. 메모리(RAM)의 100번지에 저장됨
        String str3 = new String("Java Programming"); // ex. new 연산자를 사용해 새로운 주소 200번지에 저장됨

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");
        System.out.println("원 문자열3 ==> [" + str3 + "]\n");

        System.out.println("문자열1==문자열2 결과 :\t    " + (str1==str2));
        System.out.println("문자열1.equals(문자열2) 결과 : " + str1.equals(str2));
        System.out.println("문자열1==문자열3 결과 :\t    " + (str1==str3)); // 아래처럼
        System.out.println("문자열1.equals(문자열3) 결과 : " + str1.equals(str3));


    }
}
