package N04_Array;

public class Ex02_MultiArray {
    public static void main(String[] args) {
        int[][]x = new int[2][5];
        int num = 1;

        for(int i=0;i<x.length;i++){
            for (int j=0;j<x[i].length;j++){
                x[i][j] = num;
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
