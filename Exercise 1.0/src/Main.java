public class Main {
    public static void main(String[] args) throws Exception {
        var x = isInRange(5,7,9);
    }

    public static boolean isInRange(int n, int min, int max) throws Exception
    {
        if(n < min || n > max){
            throw new Exception("Not in range");
        }
        return true;

    }
}