// Задание2
// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл

package HomeWork.Seminar2;
import java.io.IOException;
import java.util.logging.*;

public class task2_HW_sem2 {
        
        
       
        
        public static void main(String[] args) throws SecurityException, IOException  {
                Logger logger = Logger.getLogger(task2_HW_sem2.class.getName());
                
                FileHandler fh = new FileHandler("text.xml");
                
                logger.addHandler(fh);
                // SimpleFormatter sFormat = new SimpleFormatter();
                XMLFormatter xml = new XMLFormatter();
                // fh.setFormatter(sFormat);
                fh.setFormatter(xml);                
                
                logger.log(Level.INFO,"Program started");
                int[]arr = new int[]{2,5,3,1,4};                

                for(int item : arr){
                        System.out.printf("%d ",item);                        
                }
                System.out.println();                
                int temp =0;                
                for(int out = arr.length-1;out>=1;out--){
                        for(int in = 0;in< out;in++){                        
                                if(arr [in]>arr[in+1]){
                                        logger.log(Level.INFO,"The number {0} changed position with the number {1} " ,new Object[]{arr[in],arr[in+1]});
                                        temp = arr[in];
                                        arr[in] = arr[in+1];
                                        arr[in+1] = temp;                                                                  
                                } 
                        }
                }
                for(int item : arr){                        
                        System.out.printf("%d ",item);
                        
                }
                logger.info("The program is completed");

        }       
        

}
