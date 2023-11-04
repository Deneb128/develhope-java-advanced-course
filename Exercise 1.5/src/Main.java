import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        f1();
        f2();
        f3();
        f4();
    }

    public static void f1()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number 1: ");
        int number1 = Integer.valueOf(scanner.nextLine().toString());
        System.out.print("number 2: ");
        int number2 = Integer.valueOf(scanner.nextLine().toString());
        autoboxSum(number1,number2);
    }

    public static void f2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number 1: ");
        Integer number1 = Integer.valueOf(scanner.nextLine().toString());
        System.out.print("/nnumber 2: ");
        Integer number2 = Integer.valueOf(scanner.nextLine().toString());
        unboxedSum(number1,number2);
    }

    public static void autoboxSum(int a, int b)
    {
        System.out.println("[autobox]Sum of " + a + " and " + b + " is " + (a + b));
    }

    public static void unboxedSum(Integer a, Integer b)
    {
        System.out.println("[unbox]Sum of " + a + " and " + b + " is " + (a + b));
    }

    public static void f3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char c = scanner.nextLine().toString().charAt(0);
        autoboxPrintChar(c);
    }

    public static void f4()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a char: ");
        Character c = scanner.nextLine().toString().charAt(0);
        unboxPrintChar(c);
    }

    public static void autoboxPrintChar(Character c)
    {
        System.out.println("[autobox]char: " + c);
    }

    public static void unboxPrintChar(char c)
    {
        System.out.println("[unbox]char: " + c);
    }
}