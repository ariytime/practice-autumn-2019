package lesson02.part02;

/**
 * Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 * Пример вывода на экран:
 * 8
 * 88
 * 888
 * 8888
 * 88888
 * 888888
 * 8888888
 * 88888888
 * 888888888
 * 8888888888
 * <p>
 * <p>
 * Требования:
 * 1.	Программа не должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить числа на экран.
 * 3.	Программа должна выводить прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
 * 4.	В программе должен использоваться цикл for.
 */

public class Task37 {
    public static void main(String[] args) {
        String s="";
        String s2="8";
        for(int i=0; i<10; i++){
            s+=s2;
            System.out.println(s);
        }
    }
}
