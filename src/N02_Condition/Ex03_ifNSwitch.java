package N02_Condition;

import java.util.Random;

public class Ex03_ifNSwitch {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(3)+1;

        // if
        if(x == 1){
            System.out.println(x);
        }
        else if (x == 2) {
            System.out.println(x);
        }
        else {
            System.out.println(x);
        }

        // switch
        switch (x){
            case 1:
                System.out.println(x);
                break;
            case 2:
                System.out.println(x);
                break;
            default:
                System.out.println(x);
                break;
        }
    }
}
