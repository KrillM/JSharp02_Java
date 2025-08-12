package N02_Condition;

public class Ex02_For {
    public static void main(String[] args) {

        // for
        for(int i=1;i<11;i++) {
            System.out.println(i);
        }

        // for-each : 배열, 컬렉션을 순회한다.
        int [] x = {1,2,3,4,5,6,7,8,9,10};

        for(int i : x){
            System.out.println(i);
        }
    }
}
