public class Main {
    public static void main(String[] args) {
        divideByZero(4);
    }

    public static void divideByZero(int index) {
        int[] arr = {5, 7, 8, 9, 4, 7};
        if (index < 0 || index >= arr.length) {
            throw new RuntimeException("Index " + index + " out of bounds for length " + arr.length);
        }
        try {
            var div = arr[index] / 0;
        } catch (Exception e) {
            throw new RuntimeException("Division by 0");
        }
    }
}