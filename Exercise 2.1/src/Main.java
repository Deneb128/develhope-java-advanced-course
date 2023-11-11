import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        var studentList = new ArrayList<Student>();
        for(int i = 0; i < 15; i++){
            studentList.add(new Student("Ginopippo", r.nextInt(13) + 18));
        }

        for(var val : studentList){
            System.out.println(val);
        }

    }
}