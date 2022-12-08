// Задача1
// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.
package HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1_sem5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);        
        Map<String, ArrayList<String>> db = new HashMap<String, ArrayList<String>>();
while(true){
        System.out.println("\nВведите Фамилию и имя сотрудника :");        
        String employerId = scan.nextLine();
        if (db.containsKey(employerId)){
            System.out.println("Этот сотрудник уже записан.");
            System.out.printf("%s %s ",employerId,db.get(employerId));
            continue;           
        }
        else{       
        ArrayList<String> emp = new ArrayList<>();
        db.put(employerId,addTlf(emp));
        }
        
        for (Map.Entry key: db.entrySet()) {
            System.out.println("\nСотрудник :" + key.getKey() + " \nтелефоны : " + key.getValue());
        }
    }
    }   
    public static ArrayList<String> addTlf (ArrayList<String> emp){
        Scanner scan = new Scanner(System.in);
        String temp;
        for( int i =0; i< emp.size()+1;i++){
                    System.out.print("Введите телефон или  '0' для выхода :");            
                    temp = (scan.nextLine());
                    if (!temp.equals("0")) emp.add(temp);          
        }
        return emp;
    }
}  
