package test;

import java.util.Arrays;

public class TestDebug {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            i+=i;
        }
        int a=1;
        int b=2;
        int[] arr=new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[3]=3;
        Arrays.toString(arr);
        int m=method(10);
        for (int j = 0; j < 10; j++) {

        }
        for (int i:arr
             ) {
            System.out.println(i);
        }
    }
    public static int method(int b){
        int a=b;
        return a;
    }
}
