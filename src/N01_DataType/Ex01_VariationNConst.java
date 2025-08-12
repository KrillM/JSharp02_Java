package N01_DataType;

public class Ex01_VariationNConst {
    public static void main(String[] args) {

        // 선언 : 변수나 상수를 처음 작성할 때 '선언한다'라고 표기
        // 초기화: 변수나 상수의 값을 처음 대입할 때
        // 대입: 초기화 된 변수의 값을 변경할 때, 대입 가능 여부가 변수와 상수로 나누어진다.

        // 변수 선언과 동시에 초기화
        int x = 10;
        System.out.println(x);

        // 대입: 변수는 대입이 가능하다.
        x = 20;
        System.out.println(x);

        // 상수: 데이터 타입 앞에 final을 반드시 작성해야 한다.
        final double pi = 3.14;
        System.out.println(pi);

        // 상수는 대입할 수 없으므로 에러가 발생한다.
//        pi = 8.15;

    }
}
