package N03_Function;

public class Ex01_Method {

    // static이란?
    // 모든 객체가 하나의 값을 공유하며 객체 마다 따로 저장되는 것이 아니라 메모리에 한 번만 만들어진다.

    // 파라미터를 받고 반환값이 있을때
    static String GetterNSetter(String word){
        return word;
    }

    // 반환값만 있을 때
    static String Getter(){
        return "Getter";
    }

    // 파라미터만 받을 때
    static void Setter(){
        System.out.println("Setter");
    }

    // 그냥 메소드일 때
    static void JustMethod(){
        System.out.println("Normal Method");
    }

    public static void main(String[] args) {

        // Getter and Setter는 인자라고 부른다.
        String showGetterNSetter = GetterNSetter("Getter and Setter");
        System.out.println(showGetterNSetter);
        System.out.println(Getter());
        Setter();
        JustMethod();
    }
}
