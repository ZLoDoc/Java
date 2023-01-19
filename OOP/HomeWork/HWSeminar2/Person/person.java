package OOP.HomeWork.HWSeminar2.Person;

public abstract class person {
    String firstName;
    String middleName;
    String lastName;
    Integer age;
    

    public person() {
    }

    
    public person(String firstName) {
        this.firstName = firstName;
    }


    public person(String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
    }


    public person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }


    public person(String firstName, String middleName, String lastName, Integer age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName+" "+middleName+" "+lastName+" - "+age; 
    }
    

    
    
}
