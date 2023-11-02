public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("division: " + division(5,0));
    }

    public static double division(int x, int y) throws Exception { //with float/double it will give `Infinity`
        try{
            return x/y;
        }catch(Exception e){
            throw new Exception("division by 0");
        }
    }
}