public class Main {
    public static void main(String[] args) {
        divideByZero(-3);
    }

    public static void divideByZero(int index) {
        int[] arr = {5, 7, 8, 9, 4, 7};
        try {
            var div = arr[index] / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index " + index + " out of bound.");
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }
    }
}