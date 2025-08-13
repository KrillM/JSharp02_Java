package N04_Array;

import java.util.Arrays;

public class Ex01_SimpleArray {

    static int[]x3(int num){
        int[]x = new int[num];
        for(int i=0;i<num;i++){
            x[i] = i+1;
        }
        return x;
    }

    public static void main(String[] args) {
        // 변수의 단점: 초기화를 한 번 밖에 할 수 없다. 이를 해결하기 위해 배열을 사용한다.

        int[]x1 = {1,2,3,4,5};
        int[]x2 = new int[10];

        for(int i=0;i<x2.length;i++){
            x2[i]=i+1;
        }

        System.out.println(Arrays.toString(x1));
        System.out.println(Arrays.toString(x2));
        System.out.println(Arrays.toString(x3(x1.length)));
        System.out.println(Arrays.toString(x3(x2.length)));
    }
}
