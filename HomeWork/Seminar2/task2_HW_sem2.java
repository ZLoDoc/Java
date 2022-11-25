// Задание2
// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл
// https://yandex.ru/video/preview/18259980566410006101
package HomeWork.Seminar2;
import java.util.logging.*;




public class task2_HW_sem2 {
        
        private static Logger logger = Logger.getLogger(task2_HW_sem2.class.getName());
        public static void main(String[] args) {
                
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
                                        temp = arr[in];
                                        arr[in] = arr[in+1];
                                        arr[in+1] = temp;                                
                                } 
                        }
                }
                for(int item : arr){
                        System.out.printf("%d ",item);
                }
        }
        

}
