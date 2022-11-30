
// Задача1.
// Реализовать алгоритм сортировки слиянием
// Сортируемый массив разбивается на две части примерно одинакового размера;
// Каждая из получившихся частей сортируется отдельно, например — тем же самым алгоритмом;
// Два упорядоченных массива половинного размера соединяются в один.
// 1.1. — 2.1. Рекурсивное разбиение задачи на меньшие происходит до тех пор, пока размер массива не достигнет единицы (любой массив длины 1 можно считать упорядоченным).

// 3.1. Соединение двух упорядоченных массивов в один.
// Основную идею слияния двух отсортированных массивов можно объяснить на следующем примере. Пусть мы имеем два уже отсортированных по возрастанию подмассива. Тогда:
// 3.2. Слияние двух подмассивов в третий результирующий массив.
// На каждом шаге мы берём меньший из двух первых элементов подмассивов и записываем его в результирующий массив. Счётчики номеров элементов результирующего массива и 
// подмассива, из которого был взят элемент, увеличиваем на 1.
// 3.3. «Прицепление» остатка.
// Когда один из подмассивов закончился, мы добавляем все оставшиеся элементы второго подмассива в результирующий массив.
package HomeWork.Seminar3;

public class task1_HW_sem3 {
    public static void main(String[] args) {

        int[] arr =new int[] {2,1,4,3,6,5,8,7};
        int[] resArr = sortArray(arr);
        System.out.println();

        for(int i =0; i<resArr.length;i++){
            System.out.printf("%d ",resArr[i]);
        }
        
    }

    public static int [] sortArray(int[] arr){ 
              
        if (arr == null) {
            return null;
        }       
        if (arr.length < 2) {
            return arr;
        }
      
        int [] arr1 = new int[arr.length / 2];
        int [] arr2 = new int[arr.length - arr.length / 2];
        for (int i= 0; i<arr.length;i++){
            if(i<arr.length/2){
                arr1[i] = arr[i];                
            }
            if(i>=arr.length/2){
                arr2[i-arr.length/2]=arr[i];
            }
        }
        arr1 = sortArray(arr1);        
        arr2 = sortArray(arr2);        
        return mergeArray(arr1, arr2);
    }

    public static int [] mergeArray(int [] arr1, int [] arr2) {
        int[]resArr = new int[arr1.length+arr2.length];
        int index1=0, index2=0;
        for (int i=0; i<resArr.length; i++) {
    
            if (index1 > arr1.length-1) {
                int a = arr2[index2];
                resArr[i] = a;
                index2++;
            }
            else if (index2 > arr2.length-1) {
                int a = arr1[index1];
                resArr[i] = a;
                index1++;
            }
            else if (arr1[index1] < arr2[index2]) {
                int a = arr1[index1]; 
                resArr[i] = a;
                index1++;
            }
            else {
                int b = arr2[index2];
                resArr[i] = b;
                index2++;
            }
        }
        

        for(int item:resArr){
            System.out.printf("result = %d;\n",item);        
        }
        System.out.println("---------------------------------");

        return resArr;
    }
    

}
