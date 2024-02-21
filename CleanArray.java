import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CleanArray {

///////////////////////////////////// Arraylist заменен на СТЭК, т.к. очередь
    public class SimpleStore {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //ArrayList<String> customers = new ArrayList<>();
            Stack<String> customers = new Stack<>();

            while (true) {
                System.out.println("Меню:");
                System.out.println("1. Войти в магазин");
                System.out.println("2. Покупка завершена и выйти из магазина");
                System.out.println("3. Выйти из магазина без покупок");
                System.out.print("Выберите действие: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Введите ваше имя: ");
                        String name = scanner.nextLine();
                        //customers.add(name);
                        customers.push(name);
                        System.out.println("Добро пожаловать в магазин, " + name + "!");
                        break;
                    case 2:
                        if (customers.isEmpty()) {
                            System.out.println("Магазин пуст. Нет клиентов для выхода.");
                        } else {
                            //String exitingCustomer = customers.remove(0);
                            String exitingCustomer = customers.pop();
                            System.out.println("Спасибо за покупку, " + exitingCustomer + "! До свидания!");
                        }
                        break;
                    case 3:
                        System.out.println("Вы вышли из магазина без покупок.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        }
    }

//////////////////////////////////////// Подсчет количества пассажиров в поезде, номер места был индексом, логичнее использовать HashMap
    public class TrainPassengerCalculator {
        public static void main(String[] args) {
            // Train and passangers
            //int[] train = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2};

            HashMap<Integer, Integer> train = new HashMap<>();
            train.put(1, 1);
            train.put(2, 2);
            train.put(3, 1);
            train.put(4, 2);
            train.put(5, 1);
            train.put(6, 2);
            train.put(7, 1);
            train.put(8, 2);
            train.put(9, 1);
            train.put(10, 2);
            train.put(11, 1);
            train.put(12, 2);
            train.put(13, 1);
            train.put(14, 2);
            train.put(15, 1);
            train.put(16, 2);
            train.put(17, 1);
            train.put(18, 2);
            train.put(19, 1);
            train.put(20, 2);


            //int totalSeats = train.length;
            int totalSeats = train.size();

            int totalPassengers = calculateTotalPassengers(train);

            System.out.println("Total seats in the train: " + totalSeats);
            System.out.println("Total passengers in the train: " + totalPassengers);
        }


        //public static int calculateTotalPassengers(int[] train) {
        public static int calculateTotalPassengers(HashMap<Integer, Integer> train) {
            int totalPassengers = 0;
            //for (int seats : train) {
            for (int seats : train.values()) {
                totalPassengers += seats;
            }
            return totalPassengers;
        }
    }

    //////////////////////////////////////////////////////
    public class PlanetCounter {
        public static void main(String[] args) {
            //String[] planetNames = {"Земля", "Марс", "Венера", "Юпитер", "Сатурн"};
            //int[] planetCounts = {1, 2, 1, 4, 2};
            HashMap<String, Integer> planetCounts = new HashMap<>();

            planetCounts.put("Земля", 1);
            planetCounts.put("Марс", 2);
            planetCounts.put("Венера", 1);
            planetCounts.put("Юпитер", 4);
            planetCounts.put("Сатурн", 2);


            System.out.println("Количество планет различных типов:");
//            for (int i = 0; i < planetNames.length; i++) {
//                System.out.println(planetNames[i] + ": " + planetCounts[i]);
//            }

            for (String planet : planetCounts.keySet()) {
                int count = planetCounts.get(planet);
                System.out.println(planet + ": " + count);
            }
        }
    }

    /////////////////////////////////////////////////////// Данный код становится сложным из за необходимости ручного управления массива при добавлении и удаление задачи,
    // плюс ограничены размером массива ().

//    public class TaskManagementSystem {
//        private static final int MAX_TASKS = 1000; // Максимальное количество задач
//        private String[] tasks = new String[MAX_TASKS]; // Массив для хранения задач
//        private int taskCount = 0; // Текущее количество задач
//
//        // Метод для добавления задачи
//        public void addTask(String task) {
//            if (taskCount < MAX_TASKS) {
//                tasks[taskCount] = task;
//                taskCount++;
//            } else {
//                System.out.println("Ошибка: достигнуто максимальное количество задач.");
//            }
//        }
//
//        // Метод для удаления задачи
//        public void removeTask(String task) {
//            for (int i = 0; i < taskCount; i++) {
//                if (tasks[i].equals(task)) {
//                    for (int j = i; j < taskCount - 1; j++) {
//                        tasks[j] = tasks[j + 1];
//                    }
//                    tasks[taskCount - 1] = null;
//                    taskCount--;
//                    return;
//                }
//            }
//            System.out.println("Ошибка: задача не найдена.");
//        }
//
//        // Метод для отображения всех задач
//        public void displayTasks() {
//            System.out.println("Список задач:");
//            for (int i = 0; i < taskCount; i++) {
//                System.out.println((i + 1) + ". " + tasks[i]);
//            }
//        }
//
//        public void main(String[] args) {
//            TaskManagementSystem tms = new TaskManagementSystem();
//
//            tms.addTask("Task 001");
//            tms.addTask("Task 002");
//            tms.addTask("Do some thing 003");
//
//            tms.displayTasks();
//
//            tms.removeTask("Buy something");
//            tms.displayTasks();
//        }
//    }

    public class TaskManagementSystem {
        private ArrayList<String> tasks = new ArrayList<>();

        // Метод для добавления задачи
        public void addTask(String task) {
            tasks.add(task);
            System.out.println("Задача '" + task + "' успешно добавлена.");
        }

        // Метод для удаления задачи
        public void removeTask(String task) {
            if (tasks.remove(task)) {
                System.out.println("Задача '" + task + "' успешно удалена.");
            } else {
                System.out.println("Ошибка: задача '" + task + "' не найдена.");
            }
        }

        // Метод для отображения всех задач
        public void displayTasks() {
            System.out.println("Список задач:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }

        public void main(String[] args) {
            TaskManagementSystem tms = new TaskManagementSystem();

            tms.addTask("Покупка продуктов");
            tms.addTask("Сходить в банк");
            tms.addTask("Записаться на занятия йогой");

            tms.displayTasks();

            tms.removeTask("Покупка продуктов");
            tms.displayTasks();
        }
    }

    ///////////////////////////////////// Неочевидный код, использование индексов как пояснение...
    // Переделал на TreeMap

//    public class CorporationManagement {
//        public static void main(String[] args) {
//            // Создаем двумерный массив для хранения информации о сотрудниках:
//            // [0] - Имя сотрудника
//            // [1] - Отдел
//            // [2] - Должность
//            // [3] - Зарплата
//            String[][] employees = {
//                    {"John Doe", "Marketing", "Manager", "5000"},
//                    {"Alice Smith", "Finance", "Analyst", "4000"},
//                    {"Bob Johnson", "IT", "Developer", "6000"}
//            };
//
//            // Получаем информацию о сотруднике по его индексу в массиве
//            int employeeIndex = 1; // Например, хотим получить информацию о втором сотруднике (индекс 1)
//            if (employeeIndex >= 0 && employeeIndex < employees.length) {
//                String[] employee = employees[employeeIndex];
//                System.out.println("Имя: " + employee[0]);
//                System.out.println("Отдел: " + employee[1]);
//                System.out.println("Должность: " + employee[2]);
//                System.out.println("Зарплата: " + employee[3]);
//            } else {
//                System.out.println("Сотрудник с индексом " + employeeIndex + " не найден.");
//            }
//        }
//    }

    public class CorporationManagement {
        public static void main(String[] args) {
            // Создаем TreeMap для хранения информации о сотрудниках:
            // Ключ - имя сотрудника, Значение - объект Employee
            Map<String, Employee> employees = new TreeMap<>();

            // Добавляем информацию о сотрудниках в TreeMap
            employees.put("John", new Employee("John Doe", "Marketing", "Manager", 5000));
            employees.put("Alice", new Employee("Alice Smith", "Finance", "Analyst", 4000));
            employees.put("Bob", new Employee("Bob Johnson", "IT", "Developer", 6000));

            // Получаем информацию о сотруднике по его имени
            String employeeName = "Alice";
            Employee alice = employees.get(employeeName);
            if (alice != null) {
                System.out.println("Имя: " + alice.getName());
                System.out.println("Отдел: " + alice.getDepartment());
                System.out.println("Должность: " + alice.getPosition());
                System.out.println("Зарплата: " + alice.getSalary());
            } else {
                System.out.println("Сотрудник с именем " + employeeName + " не найден.");
            }
        }

        static class Employee {
            private String name;
            private String department;
            private String position;
            private double salary;

            public Employee(String name, String department, String position, double salary) {
                this.name = name;
                this.department = department;
                this.position = position;
                this.salary = salary;
            }

            public String getName() {
                return name;
            }

            public String getDepartment() {
                return department;
            }

            public String getPosition() {
                return position;
            }

            public double getSalary() {
                return salary;
            }
        }
    }


}
