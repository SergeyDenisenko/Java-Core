package lesson2;

public class Tasks {

    /**
     * метод, возвращающий количество чётных элементов массива.
     * @param args массив целых чисел
     * @return количество четных элементов
     */
    public static int countEvens(int[] args) {
        int count=0;
        for (int i=0; i<args.length; i++) {
            if (args[i] != 0 && args[i] % 2 == 0) count++;
        }
        return count;
    }

    /**
     * метод возвращающую разницу между самым большим и самым 
     * маленьким элементами переданного не пустого массива.
     * @param args массив целых чисел
     * @return разница между самым большим и самым маленьким элементом массива
     */
    public static int differenceMaxMin(int[] args) {
        int diff=0;

        if (args.length >= 2) {
            int max, min;
            if (args[0] > args[1]) {
                max = args[0];
                min = args[1];
            } else {
                max = args[1];
                min = args[0];
            }

            for (int i=2; i<args.length; i++) {
                if (args[i] > max) {
                    max = args[i];
                } else if (args[i] < min) {
                    min = args[i];
                }
            }
            diff = max - min;
        }
        return diff;
    }

    /**
     * метод возвращающую истину, если в переданном массиве
     * есть два соседних элемента, с нулевым значением.
     * @param args массив целых чисел
     * @return true если два соседних элемента имеют нулевое значение
     */
    public static boolean isTwoAdjacentElementsSame(int[] args) {
        return isTwoAdjacentElementsSame(args, 0);
    }

    /**
     * метод возвращающую истину, если в переданном массиве
     * есть два соседних элемента, с одинаковым значением.
     * @param args массив целых чисел
     * @return true если два соседних элемента имеют одинаковое значение
     */
    public static boolean isTwoAdjacentElementsSame(int[] args, int find) {
        boolean same = false;

        if (args.length == 2) {
            same = (args[0] == find) && (args[1] == find);
        } else if (args.length > 2) {
            for (int i=1; i<args.length; i++) {
                if (args[i-1] == find && args[i] == find) {
                    same = true;
                    break;
                }
            }
        }

        return same;
    }
}
