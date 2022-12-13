//Дан массив nums = [3,2,2,3] и число val = 3
// Если в массиве есть числа, равные, нужно перевести эти элементы в конец массива.
package Seminar.Seminar1;
public class task3 
{
    public static void main(String[] args)
    {
        int[] arr = new int[]{3,1,2,4,5,3};
        int value  = 3;
        for(int item : arr)
        {
            System.out.printf("%d ", item);
        }
        System.out.printf("\n");    
        for (int i = 0; i<arr.length; i++)
        {
            
            if (arr[i] == value)
            {
                for(int j=i; j<arr.length-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                arr[arr.length - 1] = value;
            }
        }

        for(int item : arr)
        {
            System.out.printf("%d ",item);
        }     
        
    }
}



