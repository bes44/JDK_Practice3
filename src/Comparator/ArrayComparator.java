package Comparator;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые,
 * и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать
 * элементы одного типа по парно по индексам.
 */

import java.util.Arrays;

public class ArrayComparator {

    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1 == array2) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {4, 5, 6};
        String[] array4 = {"a", "b", "c"};
        String[] array5 = {"a", "b", "c"};
        String[] array6 = {"a", "b", "d"};

        System.out.println("Сравнение array1 и array2: " + compareArrays(array1, array2));
        System.out.println("Сравнение array1 и array3: " + compareArrays(array1, array3));
        System.out.println("Сравнение array4 и array5: " + compareArrays(array4, array5));
        System.out.println("Сравнение array4 и array6: " + compareArrays(array4, array6));
    }
}
