class Car2 { // 앞의 예제에서 Car 이라는 class 가 이미 존재함
    private String color; // 남은 못 쓰고 나만 쓸 수 있음. 속성(변수)은 private 으로 해주는게 좋대! 함부로 변경할 수 없어서. 행위(메소드)는 public 으로 해주고, 메소드를 통해서 속성에 간접적으로 접근할 수 있게 해주래.
    private int speed;

    Car2(String color, int speed) {
        this.color = color; // Car2 라는 class 아래에서 선언된 변수 color. 파라미터 color 와 위에서 private 으로 선언된 속성 color 을 구분하기 위해, 위에 선언된 속성 color 를 this.color 라고 통칭
        this.speed = speed; // Car2 라는 class 아래에서 선언된 변수 speed. 위와 같은 이유에서 this.speed 라고 통칭
    }

    public String getColor() { // 퍼블릭 함수를 통해 프라이빗 변수로 선언 되어있는 값을 가지고 온거
        return color;
//        return this.color;
    }

    public int getSpeed() {
        return speed;
//        return this.speed;
    }
}

public class Ex11_07 {
    public static void main(String[] args) {
        Car2 myCar1 = new Car2("빨강", 0);
        Car2 myCar2 = new Car2("파랑", 30);

        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
        System.out.println("자동차2의 색상은 " + myCar2.getColor() + "이며, 현재속도는 " + myCar2.getSpeed() + "km 입니다.");
    }
}
