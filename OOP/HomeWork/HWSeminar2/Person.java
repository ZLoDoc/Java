package OOP.HomeWork.HWSeminar2;

public  class Person {
    Integer id;
    String firstName;    
    String lastName;
    Integer age;
    



    public Person(Integer id, String firstName, String lastName, Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }




    @Override
    public String toString() {
        return "Person"+ id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age;
    }




    

    
    
}
