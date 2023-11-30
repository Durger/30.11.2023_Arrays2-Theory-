import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int invalue = 10000;
       long longFromInt = invalue;

       double doublelevel = 3.14150;
       Double doubleproject = Double.valueOf(doublelevel);

       System.out.println("Это значение переменной Doubleobject" + doubleproject);

       double doubleValue = invalue;
       System.out.println(doubleValue);

       String doubleValButString = "3";
       double doubleFromString = Double.parseDouble(doubleValButString);
       int intFromString = Integer.parseInt(doubleValButString);
        System.out.println(doubleFromString);
        System.out.println(intFromString);
       double doublevalue = (double) invalue;
        System.out.println(doubleValue);

        // Integer sum = new Integer(2)  + new Integer(3);
        int sum = 2 + 3;
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите информацию");
        String info = scanner.nextLine();
        System.out.println(info);
        }

    }
