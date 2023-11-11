public class Student {
    String name;
    int age;

    public Student(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

     public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
