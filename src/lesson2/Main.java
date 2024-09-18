package lesson2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 0, 0, 2, 5, 8, 9, 4, 7, 6, 0, 10, 12, 11, 0, 0};

        System.out.println("Количсетво четных элементов в массиве: " + Tasks.countEvens(arr));
        System.out.println("Разница между максимальным и минимальным элементами массива: " + Tasks.differenceMaxMin(arr));
        System.out.println("Два соседних элемента имеют нулевое значение: " + Tasks.isTwoAdjacentElementsSame(arr));
    }
}