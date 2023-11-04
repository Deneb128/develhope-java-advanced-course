import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        var mySet = giveMeASet();
        String toAdd = "new";
        mySet.add(toAdd);
        printSet(mySet);
        for(var value : mySet){
            if (value == toAdd){
                mySet.remove(value);
                System.out.println("the string " + toAdd + " has been removed to the set");
                break;
            }
        }
        printSet(mySet);
        System.out.println("cleaning set..");
        mySet.clear();
        printSet(mySet);

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

    public static void printSet(HashSet<String> set)
    {
        System.out.println("Set:");
        System.out.println(set);
    }
}