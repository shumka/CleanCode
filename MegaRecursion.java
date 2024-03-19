import java.util.ArrayList;
import java.util.List;
import java.io.File;


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

    public static boolean fourthRecursion(String palindrome) {
        return fourthRecursion(palindrome, 2, 1);
    }

    private static boolean fourthRecursion(String palindrome, int start, int end) {
        if (start >= end)
            return true;
        if (palindrome.charAt(start) != palindrome.charAt(end))
            return false;
        return fourthRecursion(palindrome, start + 1, end - 1);
    }

    public static void fiveRecursion(List<Integer> list){
        fiveRecursion(list, 0);
    }
    private static void fiveRecursion(List<Integer> list, int index) {
        if (index == list.size()) {
            return;
        }
        if (list.get(index) % 2 == 0) {
            System.out.println(list.get(index));
        }
        fiveRecursion(list, index + 1);
    }

    public static void sixRecursion(List<Integer> list){
        sixRecursion(list, 0);
    }
    private static void sixRecursion(List<Integer> list, int index) {
        if (index >= list.size()) {
            return;
        }
        System.out.println(list.get(index));
        sixRecursion(list, index + 2);
    }

    public static int sevenRecursion(int[] arr) {
        return sevenRecursion(arr, 0, arr[0], arr[1]);
    }

    private static int sevenRecursion(int[] arr, int n, int max, int secondMax) {
        if (n == arr.length) {
            return secondMax;
        }

        if (arr[n] > max) {
            secondMax = max;
            max = arr[n];
        } else if (arr[n] > secondMax && arr[n] < max) {
            secondMax = arr[n];
        }

        return sevenRecursion(arr, n+1, max, secondMax);
    }

    public static List<String> eightRecursion(String directoryPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileList.add(file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    fileList.addAll(eightRecursion(file.getAbsolutePath()));
                }
            }
        }
        return fileList;
    }

    public static List<String> hardRecursion(int n) {
        List<String> result = new ArrayList<>();
        generateHard(result, "", n, n);
        return result;
    }

    public static void generateHard(List<String> result, String s, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }

        if (left > 0) {
            generateHard(result, s + "(", left - 1, right);
        }

        if (right > left) {
            generateHard(result, s + ")", left, right - 1);
        }
    }



}
