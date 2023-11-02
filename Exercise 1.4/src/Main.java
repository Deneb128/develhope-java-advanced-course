public class Main {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = null;
        checkNull(a,b);
    }

    public static void checkNull(Integer a, Integer b)
    {
        if(a == null || b == null){
            throw new RuntimeException("Null object");
        }
    }
}