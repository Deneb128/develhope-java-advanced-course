public class Main {
    public static void main(String[] args) throws Exception {
        char x = '7';
        char y = 'a';
        System.out.println(isNumeric(x));
        System.out.println(isNumeric(y));
    }

    private static boolean isNumeric(char str) throws Exception {
        try {
            Integer.parseInt(String.valueOf(str));
            return true;
        } catch(NumberFormatException e){
            throw new Exception("not a number");
        }
    }
}