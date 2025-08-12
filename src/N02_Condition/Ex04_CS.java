package N02_Condition;

public class Ex04_CS {
    public static void main(String[] args) {

        // break: 조건을 만족할 때 바로 종료
        for(int i=1;i<11;i++){
            System.out.println(i);
            if(i==5) break;
        }

        for(int i=1;i<11;i++){
            if(i==5) break;
            System.out.println(i);
        }

        System.out.println();

        // continue: 조건을 만족할 때 건너뜀
        for(int i=1;i<11;i++){
            if(i==5) continue;
            System.out.println(i);
        }

        for(int i=1;i<11;i++){
            System.out.println(i);
            if(i==5) continue;
        }

        System.out.println();

        // return: 조건을 만족할 때 메소드 자체를 종료
        int x = 10;
        while (x > 0){
            System.out.println(x);
            x--;
            for (int i=1;i<11;i++){
                System.out.println(i);
                if(i==5) return;
            }
        }

        System.out.println();

        for(int i=1;i<11;i++){
            System.out.println(i);
        }
    }
}
