package HomeWork.OOP.HW2.Tree2;

import java.util.Arrays;

public class Programm {
    public static void main(String[] args) {
       
        var person1 = new Person(1, "Виталий Викторович", "Пшеничников", Sex.Male);
        var person2 = new Person(2, "Виктория Евгеневна", "Пшеничникова", Sex.Female);
        var person3 = new Person(3, "Алиса Витальевна", "Пшеничникова", Sex.Female);
        var person4 = new Person(4, "Майя Витальевна", "Пшеничникова", Sex.Female);
        var person5 = new Person(5, "Евгений Владимирович", "Бурдейный", Sex.Male);
        var person6 = new Person(6, "Наталья Петровна", "Бурдейная", Sex.Female);
        var person7 = new Person(7, "Виктор Григорьевич", "Пшеничников", Sex.Male);
        var person8 = new Person(8, "Ирина Васильевна", "Пшеничникова", Sex.Female); 

        var relationships = new Relationship[]
        {
            new Relationship(person1, person7, RelationshipType.Father),
            new Relationship(person1, person8, RelationshipType.Mother),
            new Relationship(person7, person1, RelationshipType.Son),
            new Relationship(person8, person1, RelationshipType.Son),

            new Relationship(person2, person5, RelationshipType.Father),
            new Relationship(person2, person6, RelationshipType.Mother),
            new Relationship(person5, person2, RelationshipType.Daughter),
            new Relationship(person6, person2, RelationshipType.Daughter),

            new Relationship(person1, person2, RelationshipType.Wife),
            new Relationship(person2, person1, RelationshipType.Husband),

            new Relationship(person3, person1, RelationshipType.Father),
            new Relationship(person3, person2, RelationshipType.Mother),
            new Relationship(person1, person3, RelationshipType.Daughter),
            new Relationship(person2, person3, RelationshipType.Daughter),

            new Relationship(person4, person1, RelationshipType.Father),
            new Relationship(person2, person2, RelationshipType.Mother),
            new Relationship(person1, person4, RelationshipType.Daughter),
            new Relationship(person2, person4, RelationshipType.Daughter),
        };
        System.out.println(relationships.length);

        FindRelationship(relationships,person1,RelationshipType.Father);
        
    }
    
    static public void FindRelationship(Relationship[]relationships,Person person,RelationshipType relationshipType){
        
            for(Relationship item: relationships){
                if (item.Person1.FirstName == person.FirstName && item.Person1.LastName == person.LastName && item.RelationshipType.equals(relationshipType))
                    System.out.println(item.Person1.FirstName+item.Person1.LastName+relationshipType);             
        }
        

               
    }
}
