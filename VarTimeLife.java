public class VarTimeLife {
    private int x;
    private int y;

//    public void setX(int newX){
//        x = newX;
//    }
//    public void setY(int newY) {
//        y = newY;
//    }

// X и Y разбросаны по разным методам, хотя это координаты

    public void setCoordinates(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public void move(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    //////////////////////////////////////////
    public class Summator {

//        private int sum;
//
//        public void calculateSum(int[] array) {
//            sum = 0;
//            for (int num : array) {
//                sum += num;
//            }
//            System.out.println("Sum: " + sum);
//        }

//Переменная по сути глобальная, просто обхявляем ее внутри метода
        public void calculateSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.println("Sum: " + sum);
        }


    }

    /////////////////////////////////////////////////////

//    import java.util.Random;
//
//    public class Example {
//        public Random random = new Random();
//
//        public void generateRandomNumbers(int count) {
//            for (int i = 0; i < count; i++) {
//                int randomNumber = random.nextInt(100);
//                System.out.println("Random number: " + randomNumber);
//            }
//        }
//    }
//
    //  Глобальная переменная random, делаем ее локальной
    public void generateRandomNum(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Random number: " + randomNumber);
        }
    }

    //////////////////////////////////////////////////////////////////



//    public static boolean EEC_help(int[] arr1, int[] arr2) {
//        Map<Integer, Integer> freq1 = new HashMap<>();
//        Map<Integer, Integer> freq2 = new HashMap<>();
//
//        for (int num : arr1) {
//            freq1.put(num, freq1.getOrDefault(num, 0) + 1);
//        }
//
//        for (int num : arr2) {
//            freq2.put(num, freq2.getOrDefault(num, 0) + 1);
//        }
//
//        System.out.println(freq1);
//        System.out.println(freq2);
//
//        for (Map.Entry<Integer, Integer> entry : freq1.entrySet()) {
//            int key = entry.getKey();
//            int value = entry.getValue();
//
//            if (!freq2.containsKey(key) || freq2.get(key) != value) {
//                return false;
//            }
//        }
//
//        return true;
//    }

// Минимизирована видимость переменных, логика вычисления вынесена в отдельные методы, код стал более модульным и читаемым

    public static boolean EEC_help(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq1 = calculateFrequency(arr1);
        Map<Integer, Integer> freq2 = calculateFrequency(arr2);

        System.out.println(freq1);
        System.out.println(freq2);

        return compareFrequencies(freq1, freq2);
    }

    private static Map<Integer, Integer> calculateFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        return frequencyMap;
    }

    private static boolean compareFrequencies(Map<Integer, Integer> freq1, Map<Integer, Integer> freq2) {
        for (Map.Entry<Integer, Integer> entry : freq1.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (!freq2.containsKey(key) || freq2.get(key) != value) {
                return false;
            }
        }
        return true;
    }



/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    import static java.lang.Character.getNumericValue;
//
//    public static boolean white_walkers(String village) {
//        int walkerCount = 0;
//        boolean flag = false;
//
//        for (int i = 0; i < village.length(); i++){
//            if(Character.isDigit(village.charAt(i)) && i != village.length() ){
//                for(int j = i+1; j < village.length(); j++){
//                    if(Character.isDigit(village.charAt(j))  &&
//                            ( getNumericValue(village.charAt(i)) + getNumericValue(village.charAt(j))  == 10)){
//                        for(int x=i,y=j; x < y; x++ ){
//                            if(village.charAt(x) == '=') {
//                                walkerCount += 1;
//                            }
//                        }
//                        if(walkerCount >= 3){
//                            flag = true;
//                        } else {
//                            flag = false;
//                        }
//                        walkerCount = 0;
//                    }
//                }
//            }
//        }
//
//        return flag;
//    }

//  Метод подсчет ХОДОКОВ был вынесен, переменная walkerCount теперь объявляется внутри цикла, чтобы её область видимости была ограничена.


    public static boolean white_walkers(String village) {
        for (int i = 0; i < village.length(); i++) {
            if (Character.isDigit(village.charAt(i))) {
                int walkerCount = 0;
                for (int j = i + 1; j < village.length(); j++) {
                    if (Character.isDigit(village.charAt(j))) {
                        int sum = Character.getNumericValue(village.charAt(i)) + Character.getNumericValue(village.charAt(j));
                        if (sum == 10) {
                            walkerCount += countWalkers(village, i, j);
                            if (walkerCount >= 3) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private static int countWalkers(String village, int start, int end) {
        int walkerCount = 0;
        for (int x = start; x < end; x++) {
            if (village.charAt(x) == '=') {
                walkerCount++;
            }
        }
        return walkerCount;
    }

    ////////////////////////////////////////////////////////////////////////////////////////


    public class Triangle {
//        double side1;
//        double side2;
//        double side3;
//        double semiPerimeter;
//        double area;

        public double calculateArea(double x1, double y1, double x2, double y2, double x3, double y3) {
//            side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//            side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
//            side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
//
//            semiPerimeter = (side1 + side2 + side3) / 2;
//            area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

            // Убрана глобальная видимость переменных

            double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

            double semiPerimeter = (side1 + side2 + side3) / 2;
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
            return area;
        }
    }



}


























}
