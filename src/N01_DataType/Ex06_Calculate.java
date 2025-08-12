package N01_DataType;

public class Ex06_Calculate {
    public static void main(String[] args) {
        // 사칙연산
        System.out.println(10+10);
        System.out.println(20-10);
        System.out.println(10*10);
        System.out.println(12/4);
        System.out.println(12%5);

        int x = 10;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);

        int y = 20;
        System.out.println(y+=20);
        System.out.println(y-=10);
        System.out.println(y*=4);

        System.out.println(x+ " "+y);

        // 등호와 부등호
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println(x == y);
        System.out.println(x != y);
    }
}
