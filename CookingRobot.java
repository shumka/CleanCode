
//Для правила 2

public class TaxiFuelCalculator {
    public static void main(String[] args) {
        double distance = 50; // Инициализация переменной distance при ее объявлении
        double fuelConsumption = 8.5; // Инициализация переменной fuelConsumption при ее объявлении
        double fuelCost = distance * fuelConsumption; // Инициализация переменной fuelCost правильным образом
        System.out.println("The fuel cost for the trip is: $" + fuelCost);
    }
}


//Для правила 3

public class TaxiFuelCalculator {
    public static void main(String[] args) {
        int distance = 50;
        double fuelConsumption = 8.5;
        double fuelCost = distance * fuelConsumption;

        // Завершение работы с переменными, присваивая им недопустимые значения
        distance = -1; // Присвоение недопустимого значения переменной distance
        fuelConsumption = -1; // Присвоение недопустимого значения переменной fuelConsumption
        fuelCost = -1; // Присвоение недопустимого значения переменной fuelCost

        System.out.println("The fuel cost for the trip is: $" + fuelCost);
    }
}

// Для правила 4
public class SimpleIterator {
    public static void main(String[] args) {
        // Инициализация переменной-счетчика цикла непосредственно перед циклом
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration " + i);
        }
    }
}


// Для правила 5
public class Invariant{
    public static void main(String[] args) {
        double radius = -5.0; // Пример недопустимого значения для переменной radius

        if (radius <= 0) {
            System.out.println("Invalid value for radius: " + radius);
        }
    }
}