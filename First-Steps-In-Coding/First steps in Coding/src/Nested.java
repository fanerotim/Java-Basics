public class Nested {
    public class InnerNested {
        String innerField = "inner-field";
    }

    public static void main(String[] args) {
        // create an instance of Nested
        Nested nestedInstance = new Nested();
        // create an instance of InnerNested by using the . syntax to access it
        InnerNested innerNestedInstance = nestedInstance.new InnerNested();
        // confirm that the new innerNestedInstance is indeed an instance of InnerNested class
        System.out.println(innerNestedInstance instanceof InnerNested);
    }
}

