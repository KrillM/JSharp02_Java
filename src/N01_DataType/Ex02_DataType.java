package N01_DataType;

public class Ex02_DataType {
    public static void main(String[] args) {
        // 숫자형: 숫자를 나타내며 정수형과 실수형으로 나누어진다
        // 정수형: 자연수, 0, 음수을 표기할 때 사용한다. int를 가장 많이 사용하나 상황에 따라 다른 데이터 타입을 사용한다.
        int num1 = 100;
        byte num2 = 10;
        short num3 = 102;
        long num4 = 1239012931239012L;

        // 실수형: 소수점 이하를 표기할 때 사용한다. double을 가장 많이 사용하다 경우에 따라 float을 사용한다.
        double num5 = 3.141592;
        float num6 = 3.14159323f;

        // 문자형: 문자를 표기할 때 사용한다.
        char ch1 = 'a';
        String ch2 = "Hello World";

        // 논리형: 참, 거짓을 판단할 때 사용하며 기본값은 true이다.
        boolean isTrue = (num1 > num2);
        System.out.println(isTrue);

        // 배열: 하나의 데이터 타입을 여러번 초기화할 때 사용한다.
        int[]arr = {1,2,3,4,5};
        System.out.println(arr[1]);

    }
}
