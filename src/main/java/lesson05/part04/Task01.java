package lesson05.part04;

/**
 * Bingo-2!
 * Исправь строчку 'Cat cat = new Cat();' так, чтобы программа вывела "Bingo!".
 * <p>
 * <p>
 * Требования:
 * 1. Класс Cat должен реализовывать интерфейс CanMove.
 * 2. Класс Cat должен быть родителем(родительским классом) класса TomCat.
 * 3. В переменной cat должен храниться объект который будет одновременно являться и CanMove, и Cat, и Tomcat.
 * 4. Программа должна выводить на экран: "Bingo!".
 */

public class Task01 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface CanMove {
    }

    static class Cat implements CanMove {
    }

    static class TomCat extends Cat {

    }
}
