// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().
package Seminar.Seminar4;

import java.util.Arrays;

public class task5_sem4 {
    public static void main(String[] args) {
        int[] testArray = new int [] {0,1,2,3,4,5,6,7,8,9};
        System.out.println(size(testArray));
        System.out.println(empty(testArray));
        System.out.println(Arrays.toString(push(testArray,45)));
        System.out.println(peek(testArray));
        System.out.println(Arrays.toString(pop(testArray)));
    }
    static public int size(int[]arg){
        return arg.length;
    }
    static public boolean empty(int[]arg){
        return arg.length==0;

    }
    static public int[] push(int[]arg, int value){
        int[] argTemp = new int[arg.length + 1];

        for (int i =0; i <arg.length; i++){
            argTemp[i]=arg[i];
        }
        argTemp[argTemp.length-1] = value;
        return argTemp;

    }
    static public int peek(int[]arg){
        return arg[arg.length-1];

    }
    static public int[] pop(int[]arg){
        int[] argTemp = new int[arg.length-1];

        for (int i =0; i <arg.length-1; i++){
            argTemp[i]=arg[i];
        }
        
        return argTemp;
        

    }


}
