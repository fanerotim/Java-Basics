public class Nested {
    public class InnerNested {
        String innerField = "inner-field";
    }
}

class Subclass extends Nested {
    public static void main(String[] args) {
        // create an instance of Subclass
        Subclass subclassInstance = new Subclass();
        // create an instance of InnerNested by using the . syntax to access it. Subclass inherits Nested classes inside its Superclass (Parent)
        InnerNested innerNestedInstance = subclassInstance.new InnerNested();
        // confirm that the new innerNestedInstance is indeed an instance of InnerNested class
        System.out.println(innerNestedInstance instanceof InnerNested);
    }
}


