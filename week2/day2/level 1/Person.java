public class Person {
    String attributes;

    public Person(){
        attributes = "Creative";
    }
    public Person(Person PreviousAtt){
        this.attributes=PreviousAtt.attributes;
    }
    void display(){
        System.out.println("person attribute: " + attributes);
    }
    public static void main(String[] args) {
        Person abc = new Person();
        System.out.println();
        abc.display();

        Person def = new Person();
        System.out.println();
        def.display();
    }
}




