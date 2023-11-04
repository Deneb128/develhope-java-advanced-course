import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var mySet = giveMeASet();
        String toAdd = "new";
        mySet.add(toAdd);
        if(mySet.contains("new")){
            System.out.println("the string " + toAdd + " has been added to the set");
        }
        System.out.println("Set:");
        System.out.println(mySet);
    }

    public static HashSet<String> giveMeASet()
    {
        var mySet = new HashSet<String>();
        Random r = new Random();
        for(int i = 0; i < 10; ++i){
            var n = r.nextInt(10) * 5;
            mySet.add(String.valueOf(n));
        }
        return mySet;
    }
}