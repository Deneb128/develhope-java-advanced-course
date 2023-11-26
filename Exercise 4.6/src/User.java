public class User {
    private static User user;
    private String name = "";
    private int age = 0;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private User(String name, int age){
        this.name = name;
        this.age = age;
    }

    private User(){}

    public static User getInstance(String name, int age){
        if (user == null){
            user = new User(name,age);
        }
        return user;
    }

    public static User getInstance(){
        if (user == null){
            user = new User();
        }
        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
