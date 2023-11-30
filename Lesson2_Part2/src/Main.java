import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Задание № 1.

        System.out.println("Full seven lines");
        System.out.println("and");
        System.out.println("stand up eight");

//Задание № 2.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите информацию");
        String info = scanner.nextLine();
        System.out.println(info);

        StringBuilder sbApend = new StringBuilder("Привет");
        sbApend.append("Хэллоу");
        System.out.println(sbApend);

        // reverse() - переворачивает строку
        // delete(x,y) - удаляет символы между указанными индексами
        //deleteChar(x) - удаляет указанный символ
        // lenght() - возвращает длинну строки
        // toString() - преобразует StringBuilder в обычную строку
        int sum = 5 + 5;

        if (sum == 5) {
            System.out.println("Ответ равен пяти");
        } else if (sum == 10) {
            System.out.println("Ответ равен пяти");
        } else {
            System.out.println("Я не знаю, что тут написано");
        }

        // Задача3.Переворот числа

        System.out.println("Введите четырехзначное число");
        int numberToReverse = scanner.nextInt();
        StringBuilder builder = new StringBuilder(String.valueOf(numberToReverse));
        builder.reverse();
        System.out.println("Число наоборот" + builder);

        // Задание №4. Работа с диапазоном чисел
        System.out.println("Введите количество часов");
        int time = scanner.nextInt();
        int hour = 1;
        if (hour < 6 && hour > 6) {
            System.out.println("Good night");
        }

        if (hour < 6 && hour > 13) {
            System.out.println("Good morning");
        }

        if (hour < 13 && hour > 17) {
            System.out.println("Good day");
        }

        if (hour < 17 && hour > 0) {
            System.out.println("Good evening");
        }

        //  Задание № 5. Сравнение целого шестизначного числа на соответствие с счастиливым.
        System.out.println("Введите шестизначное число");

       int numbers = scanner.nextInt();
       int firstPart = numbers/ 2;
       int secondPart = numbers - firstPart;

       
      //  int firstPart

       // if (sum1 + sum2 + sum3 <= sum4 + sum5 + sum6)
       // if (firstPart == secondPart) {
        //    System.out.println("У Вас счастливое число");


        }

       // if (sum1 + sum2 + sum3 <= sum4 + sum5 + sum6) {

      //  } else if (sum1 + sum2 + sum3 == sum4 + sum5 + sum6) {

        }
          //  System.out.println("Good №");





// <
// <
    // >=
    // <=
    // ==
    // i=
    // && и
    // i или


