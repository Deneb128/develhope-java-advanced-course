import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void f()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number 1: ");
        int number1 = Integer.valueOf(scanner.nextLine().toString());
        System.out.print("/nnumber 2: ");
        int number2 = Integer.valueOf(scanner.nextLine().toString());

        Integer autoboxedNumber1 = number1;
        Integer autoboxedNumber2 = number2;

        System.out.println("Sum of " + autoboxedNumber1 + " and " + autoboxedNumber2 + " is " + autoboxedNumber1 + autoboxedNumber2);

    }

    public static void f2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number 1: ");
        Integer number1 = Integer.valueOf(scanner.nextLine().toString());
        System.out.print("/nnumber 2: ");
        Integer number2 = Integer.valueOf(scanner.nextLine().toString());

        int unboxedNumber1 = number1;
        int unboxedNumber2 = number2;

        System.out.println("Sum of " + unboxedNumber1 + " and " + unboxedNumber2 + " is " + unboxedNumber1 + unboxedNumber2);

    }

    public static void m()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a char: ");
        Character c = scanner.nextLine().toString().charAt(0);
        char autoboxedc = c;
        System.out.print("char: " + autoboxedc);
    }

    public static void m2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a char: ");
        Character c = scanner.nextLine().toString().charAt(0);
        char unboxedc = c;
        System.out.print("char: " + unboxedc);
    }
}