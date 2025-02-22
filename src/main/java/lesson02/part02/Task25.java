package lesson02.part02;

/**
 * Ввести с клавиатуры два целых числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
 * Вывести на экран номер координатной четверти, в которой находится данная точка.
 * Подсказка:
 * Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
 * для первой четверти a>0 и b>0;
 * для второй четверти a<0 и b>0;
 * для третьей четверти a<0 и b<0;
 * для четвертой четверти a>0 и b<0.
 * Пример для чисел 4 6:
 * 1
 * Пример для чисел -6 -6:
 * 3
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна использовать команду System.out.println() или System.out.print().
 * 3.	Если точка находится в первой координатной четверти, вывести "1".
 * 4.	Если точка находится во второй координатной четверти, вывести "2".
 * 5.	Если точка находится в третей координатной четверти, вывести "3".
 * 6.	Если точка находится в четвёртой координатной четверти, вывести "4".
 */

import java.io.*;
import java.util.*;

public class Task25 {
    public static void main(String[] args) throws Exception {
        String num1,num2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        num1 = reader.readLine();
        num2 = reader.readLine();
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        if (a>0 && b>0){
            System.out.println("1");
        }
        if (a<0 && b>0){
            System.out.println("2");
        }
        if(a<0 && b<0){
            System.out.println("3");
        }
        if(a>0 && b<0){
            System.out.println("4");
        }
    }
}
