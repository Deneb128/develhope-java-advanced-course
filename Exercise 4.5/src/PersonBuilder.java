public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age = 0;
    private String address = "";

    public Person createPerson(){
        return new Person(this.firstName, this.lastName, this.age, this.address);
    }

    public String getFirstName() {
        return firstName;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }




    public PersonBuilder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
