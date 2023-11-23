import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a number: ");
        BigDecimal number1 = BigDecimal.valueOf(Integer.valueOf(scan.next().toString()));
        System.out.println("Insert another number: ");
        BigDecimal number2 = BigDecimal.valueOf(Integer.valueOf(scan.next().toString()));
        System.out.println("Operations: \n- add\n- subtract\n- multiply\n- divide\n- min\n- max\nChoose one:");
        String opstr = scan.next().toUpperCase();
        if (!Operations.IsOpValid(opstr)) {
            exit(1);
        }
        Operations op = Operations.valueOf(opstr);
        System.out.println("operation chosen: " + op);
        System.out.println("numbers: " + number1 + " - " + number2);
        System.out.print("result: ");
        operations(op, number1, number2);
    }

    public static void operations(Operations op, BigDecimal number1, BigDecimal number2) {
        switch (op.toString()) {
            case "add": {
                System.out.println(number1.add(number2));
            }
            break;
            case "multiply": {
                System.out.println(number1.multiply(number2));
            }
            break;
            case "subtract": {
                System.out.println(number1.subtract(number2));
            }
            break;
            case "divide": {
                System.out.println(number1.divide(number2, 2, RoundingMode.CEILING));
            }
            break;
            case "min": {
                System.out.println("min is " + number1.min(number2));
            }
            case "max": {
                System.out.println("max is " + number1.max(number2));
            }
            default:
                return;
        }
    }
}
