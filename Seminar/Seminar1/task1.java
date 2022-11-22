// Задание2
// Дан массив двоичных чисел [1,1,0,1,1,1],вывести максимальное количество подряд идущих 1.
public class task1 
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,1,1,0,1,1,0,1,1,1,1,1,1,0}; 
      
        // int[]newarr = new int[6];
        int max,count = 0;
        max =0;                                       
        for (int i=0;i<arr.length;i++)
        {
            System.out.printf("%d", arr[i]);
                           
            if (arr[i] == 1) count++;                
            if(count > max)max=count;                
            if(arr[i]==0) count =0;            
        }
            
            System.out.println(    max);
    }
}