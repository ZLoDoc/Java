package HomeWork.OOP.HW2.Tree2;

public class Relationship {
    Person Person1;
    Person Person2;
    RelationshipType RelationshipType;
    
    public Relationship(Person person1, Person person2,RelationshipType relationshipType) {
        Person1 = person1;
        Person2 = person2;
        RelationshipType = relationshipType;
    }

    @Override
    public String toString() {
        return Person1.FirstName+" "+Person1.LastName+" "+RelationshipType;
    }
    
    

}
