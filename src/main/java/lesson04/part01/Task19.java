package lesson04.part01;

/**
 * Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст "Бум!".
 * Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
 * Thread.sleep(100); //задержка на одну десятую секунды.
 *
 * Пример:
 * 30
 * 29
 * ...
 * 1
 * 0
 * Бум!
 *
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	Программа должна выводить обратный отсчет от 30 до 0. Каждую цифру на новой строке.
 * 3.	Программа должна выводить "Бум!" после отсчета.
 * 4.	Программа должна использовать метод "Thread.sleep(100);" 31 раз.
 */

public class Task19 {

  public static void main(String[] args) {
    for (int i = 30; i >= 0; i--) {
      System.out.println(i);

      //напишите тут ваш код
    }

    System.out.println("Бум!");
  }
}
