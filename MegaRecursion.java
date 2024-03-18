import java.util.ArrayList;
import java.util.List;

public class MegaRecursion {

    // 1. Возведение числа N в степень M
    public static int power(int N, int M) {
        if (M == 0)
            return 1;
        return N * power(N, M - 1);
    }

    // 2. Вычисление суммы цифр числа
    public static int sumOfDigits(int number) {
        if (number == 0)
            return 0;
        return (number % 10) + sumOfDigits(number / 10);
    }

    // 3. Расчёт длины списка с использованием pop(0)
    public static int listLength(List<Object> list) {
        if (list.isEmpty())
            return 0;
        list.remove(0);
        return 1 + listLength(list);
    }

    // 4. Проверка, является ли строка палиндромом
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1)
            return true;
        if (str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    // 5. Печать только чётных значений из списка
    public static void printEvenValues(List<Integer> list) {
        if (list.isEmpty())
            return;
        int value = list.get(0);
        if (value % 2 == 0)
            System.out.println(value);
        printEvenValues(list.subList(1, list.size()));
    }

    // 6. Печать элементов списка с чётными индексами
    public static void printElemEvenIndex(List<Integer> list, int index) {
        if (index >= list.size())
            return;
        System.out.println(list.get(index));
        printElemEvenIndex(list, index + 2);
    }

}
