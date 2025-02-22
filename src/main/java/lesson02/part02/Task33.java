package lesson02.part02;

/**
 * Вывести на экран квадрат из 10х10 букв S используя цикл while.
 * Буквы в каждой строке не разделять.
 * Пример вывода на экран:
 * SSSSSSSSSS
 * SSSSSSSSSS
 * SSSSSSSSSS
 * SSSSSSSSSS
 * SSSSSSSSSS
 * SSSSSSSSSS
 * SSSSSSSSSS
 * SSSSSSSSSS
 * SSSSSSSSSS
 * SSSSSSSSSS
 * <p>
 * <p>
 * Требования:
 * 1.	Программа не должна считывать текст c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Программа должна выводить квадрат из 10х10 букв S.
 * 4.	В программе должен использоваться цикл while.
 */

public class Task33 {
    public static void main(String[] args) {
        String s = "SSSSSSSSSS";
        int i = 1;
        while (i < 11) {
            System.out.println(s);
            i++;
        }
    }
}
