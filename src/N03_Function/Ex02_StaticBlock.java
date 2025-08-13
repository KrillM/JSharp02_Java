package N03_Function;

public class Ex02_StaticBlock {

    static String FirstReturn(){
        return "First Return";
    }

    static int x;

    static {
        System.out.println("Static 블록 실행");
        x = 10;
    }

    public static void main(String[] args) {
        System.out.println(FirstReturn());
        System.out.println("main 메서드 실행");
        System.out.println("x is " + x);
    }
}
