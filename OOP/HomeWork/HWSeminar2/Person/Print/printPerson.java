package OOP.HomeWork.HWSeminar2.Person.Print;

import OOP.HomeWork.HWSeminar2.Person.person;

public class printPerson extends person {  
    
    public printPerson() {
    }

    public printPerson(String firstName, String middleName, String lastName, Integer age) {
        super(firstName, middleName, lastName, age);
        System.out.println(firstName+lastName+middleName+age);
    }

    
    
    public void prnPerson(String firstName, String middleName, String lastName, Integer age){
        System.out.println(firstName+lastName+middleName+age);

    }
    
}
