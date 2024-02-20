package fizlrock;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Task1();
    Task2();
    Task3();
  }

  public static void Task1() {
    System.out.println("Задание №1. Если введенное число больше 7, вывести \"Привет\"");
    long number = Integer.parseInt(System.console().readLine());
    if (number > 7)
      System.out.println("Привет");
  }

  public static void Task2() {
    System.out.println(
        "Задание 2. Если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"");
    String input = System.console().readLine();
    String expected = "Вячеслав";
    String result = "Нет такого имени";
    if (input.equals(expected))
      result = "Нет такого имени";
    System.out.println(result);
  }

  public static void Task3() {
    System.out.println("Задание 3. На входе числовой массив, вывести элементы кратные 3");
    System.out.println("Массив целых чисел?");
    var nums = ThreadLocalRandom.current().ints(10, 0, 100).toArray();
    System.out.println("Исходный массив:" + Arrays.toString(nums));
    Arrays.stream(nums).filter(n -> n % 3 == 0).forEach(System.out::println);
  }
}
