package DependencyInversionPrinciple;

public class DIPDemo {

    public static void main(String[] args)
    {
        Person parent = new Person("John");
        Person parent2 = new Person("John");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");
        Person child3 = new Person("Cris");

        // low-level module
        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent, child1);
        relationships.addParentAndChild(parent, child2);
        relationships.addParentAndChild(parent2, child3);

        new Research(relationships);


    }

}
