public class Main {
    public static void main(String[] args) {
        User user1 = User.getInstance();
        System.out.println(user1); //default

        User user2 = User.getInstance();
        user2.setName("denebx128");
        user2.setAge(28); //we are actually modifying the same instance

        System.out.println(user2);
        System.out.println(user1.equals(user2)); //true
    }
}