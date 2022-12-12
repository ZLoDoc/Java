package Seminar.Seminar6;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class task1_sem6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[]arr = new int [10];
        Set<Integer> setArray = new HashSet<>();
        for (int i =0; i<arr.length;i++){
            arr[i]=rnd.nextInt(1000);
            if (!setArray.contains(arr[i])) setArray.add(arr[i]);
        }
        System.out.println(Arrays.toString (arr));
        System.out.println(setArray);
        double len = (setArray.size());
        System.out.printf("%.2f %%",len*100/arr.length);
    }
    
}
