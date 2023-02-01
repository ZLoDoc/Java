package Seminar.Tree;

public class Person {
    Integer pesonID;
    String firstName;
    String lastname;
    // String sex;
    // Integer birthDay;
    Integer parent1Id;
    Integer parent2Id;
   
    
    public Person() {
    }

    public Person(Integer pesonID, String firstName, String lastname, Integer parent1Id, Integer parent2Id) {
        this.pesonID = pesonID;
        this.firstName = firstName;
        this.lastname = lastname;
        this.parent1Id = parent1Id;
        this.parent2Id = parent2Id;
    }

    @Override
    public String toString() {
        return "Person [pesonID=" + pesonID + ", firstName=" + firstName + ", lastname=" + lastname + ", parent1Id="
                + parent1Id + ", parent2Id=" + parent2Id + "]";
    }
    
    
 

    
  

    


    
   
    
    


    
}
