package HomeWork.OOP.HW2.Tree2;

public class Relationship {
    Person Person1;
    Person Person2;
    RelationshipType RelationshipType;
    
    public Relationship(Person person1, Person person2,RelationshipType relationshipType) {
        this.Person1 = person1;
        this.Person2 = person2;
        this.RelationshipType = relationshipType;
    }

    @Override
    public String toString() {
        return Person1.FirstName+" "+Person1.LastName+" "+RelationshipType;
    }
    
    

}
