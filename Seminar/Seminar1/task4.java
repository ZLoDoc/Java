// Задача 4
// Найти самую длинную строку начинающуюся с "abc"
public class task4
{
    public static void main(String[] args) 
    {
        String[] array = {"abcdefa", "abcgkjsdkl", "bvxsdbdf", "qwerabfst", "abc"};
        String value = "abc";
        int max = 0;         
        int pos = 0;        
        System.out.printf("value = %s \n",value);               
        for (int i = 0; i < array.length; i++)
        {          
            System.out.printf(" String = %s  ",array[i]);  
            System.out.printf("length["+ i +"] = %d",array[i].length());
            System.out.printf(" substring = %s \n",array[i].substring(0, 3));
            
            if (array[i].substring(0, 3).equals(value))            
            {             
                if (array[i].length()>max)
                {               
                max = array[i].length();
                pos = i;
                }                
            }            
        }   System.out.printf("\n");
            System.out.printf("The largest row includes "+ "'" + value +"'"+ " = %d" ,max);
            System.out.printf("\n");
            System.out.printf("in the %d position", pos);
    }    
}
