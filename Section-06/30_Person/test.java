public class Test {
    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("Is teen = " + person.isTeen());

        person.setFirstName("John");
        person.setAge(18);

        System.out.println("Full name = " + person.getFullName());
        System.out.println("Is teen = " + person.isTeen());

        person.setLastName("Smith");

        System.out.println("Full name = " + person.getFullName());
    }
}
