//Проверка на полиндром
package Seminar.Seminar2;

public class task3_s2 {
    public static void main(String[] args) {
        String str = "1234320";
        System.out.println(isPolindrom(str));
    }


    public static boolean isPolindrom( String str){
        boolean flag = true;
        for (int i = 0; i < str.length()/2; i++) {
                if(str.charAt(i) != str.charAt(str.length()-1-i)){
                    flag = false;
                }
            }
        return flag;
    }
}

