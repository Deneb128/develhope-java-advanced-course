public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder("Mario", "Rossi").setAddress("Via Roma 1").setAge(40).createPerson();
        System.out.println(person);

        Person person2 = new PersonBuilder("Paolo", "Rossi").setAddress("Via Roma 2").setAge(50).createPerson();
        System.out.println(person2);
    }
}