import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var mySet = giveMeASet();
        System.out.println("Set length: " + mySet.size());
        System.out.println(mySet);
    }

    public static HashSet<Integer> giveMeASet()
    {
        var mySet = new HashSet<Integer>();
        Random r = new Random();
        for(int i = 0; i < 10; ++i){
            mySet.add(r.nextInt(10));
        }
        return mySet;
    }
}