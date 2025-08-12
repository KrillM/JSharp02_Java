package N01_DataType;

public class Ex05_ConsoleNEscape {
    public static void main(String[] args) {
        // 출력 방법
        String word = "Hello World";

        System.out.println(word);
        System.out.printf("%s", word);

        System.out.println();
        System.out.println(Math.PI);
        System.out.printf("%.2f", Math.PI);

        String apple = "Apple";
        System.out.print(apple);
        System.out.println(apple);
        System.out.printf("%d", apple.length());

        // Escape
        System.out.println("Hello\tWorld"); // Hello   World
        System.out.println("Hello\nWorld"); // Hello (줄바꿈) World
        System.out.println("Hello\rWorld"); // World (줄 처음부터 덮어씀)
        System.out.println("I\'m here");    // I'm here
        System.out.println("He said \"Hi\""); // He said "Hi"
        System.out.println("C:\\Program Files"); // C:\Program Files
    }
}
