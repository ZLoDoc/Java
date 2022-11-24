// Напишите метод, который вернет содержимое текущей папки в виде массива строк.э
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, 
// оно должно записаться в лог-файл.

package Seminar.Seminar2;


import java.io.File;


public class task5_sem2 {
    public static void main(String[] args) {
        
        direct("F:\\Books");
    }
    public static void direct(String path){
        File f = new File(path);
        String[] files = f.list();
        assert files != null;
        for (String file : files) {
            System.out.println(String.join("\n", file));
            File d = new File(path + "\\" + file);
            if (d.isDirectory()) {
                direct(path + "\\" + file);
            }
        }
    }
}

