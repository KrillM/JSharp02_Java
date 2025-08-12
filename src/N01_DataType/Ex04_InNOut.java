package N01_DataType;

import java.util.Random;
import java.util.Scanner;

public class Ex04_InNOut {
    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력");
        int x = scanner.nextInt();
        scanner.nextLine();
        System.out.println(x);

        System.out.println("단어 입력");
        String y = scanner.nextLine();
        System.out.println(y);

        // Random
        Random random = new Random();
        int n1 = random.nextInt(10)+1;
        System.out.println(n1);

        int UC = random.nextInt(26)+65;
        int LC = random.nextInt(26)+97;

        System.out.println((char) UC);
        System.out.println((char) LC);
    }
}
