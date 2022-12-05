package Seminar.Seminar2;

import java.io.FileWriter;

public class task4_Sem2 {
    public static void main(String[] args) throws Exception{
        StringBuilder myBuilder = new StringBuilder();

        for (int i=0; i<=100;i++){
            myBuilder.append("test ");
        }
        System.out.println(myBuilder);
        FileWriter fw = new FileWriter("test100.txt");
        fw.implWrite(myBuilder);
        fw.flush();
        fw.close();
    }

    
}
