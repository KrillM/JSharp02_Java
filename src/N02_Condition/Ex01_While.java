package N02_Condition;

public class Ex01_While {
    public static void main(String[] args) {

        // while
        int x = 10;
        while (x>0){
            System.out.println(x);
            x--;
        }

        // do-while : 조건이 false라도 최소 1회 실행
        int y = 11;
        do{
            System.out.println(y);
        }
        while (y < 10);
    }
}
