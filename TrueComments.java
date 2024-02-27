import java.util.HashMap;
import java.util.Map;

public class TrueComments {


    //  Класс для металлургии
    public class MetalSmeltingProcess {

        // TODO: Добавить поддержку для новых типов металлов
        // сделать ее более логичной ( все металлы как то можно сгрупирровать и назначать номер как то логичнее
        // таблица менделеева или оное...)
        // В будущем это должен быть идеальный код для плавления того или иного металла планета Земля


        // Константы для типов металлов ( Информативные комментарии)
        public static final int IRON = 0;
        public static final int COPPER = 1;
        public static final int ALUMINUM = 2;
        public static final int GOLD = 3;
        public static final int SILVER = 4;
        public static final int PLATINUM = 5;
        public static final int TITANIUM = 6;
        public static final int ZINC = 7;
        public static final int NICKEL = 8;
        public static final int LEAD = 9;
        public static final int TIN = 10;
        public static final int BRONZE = 11;
        public static final int BRASS = 12;
        public static final int STEEL = 13;
        public static final int CHROME = 14;
        public static final int ALUMINIUM_BRONZE = 15;
        public static final int PEWTER = 16;

        public static final Map<Integer, Double> meltingTemperatureC = new HashMap<>();
        public static final Map<Integer, Integer> meltingTimesMinutes = new HashMap<>();
        static {
            meltingTemperatureC.put(IRON, 1538.0);
            meltingTemperatureC.put(COPPER, 1084.0);
            meltingTemperatureC.put(ALUMINUM, 660.32);
            meltingTemperatureC.put(GOLD, 1064.0);
            meltingTemperatureC.put(SILVER, 961.78);
            meltingTemperatureC.put(PLATINUM, 1768.3);
            meltingTemperatureC.put(TITANIUM, 1668.0);
            meltingTemperatureC.put(ZINC, 419.5);
            meltingTemperatureC.put(NICKEL, 1455.0);
            meltingTemperatureC.put(LEAD, 327.5);
            meltingTemperatureC.put(TIN, 231.93);
            meltingTemperatureC.put(BRONZE, 950.0);
            meltingTemperatureC.put(BRASS, 920.0);
            meltingTemperatureC.put(STEEL, 1450.0);
            meltingTemperatureC.put(CHROME, 1907.0);
            meltingTemperatureC.put(ALUMINIUM_BRONZE, 1038.0);
            meltingTemperatureC.put(PEWTER, 232.0);

            meltingTimesMinutes.put(IRON, 10);
            meltingTimesMinutes.put(COPPER, 15);
            meltingTimesMinutes.put(ALUMINUM, 5);
            meltingTimesMinutes.put(GOLD, 20);
            meltingTimesMinutes.put(SILVER, 25);
            meltingTimesMinutes.put(PLATINUM, 30);
            meltingTimesMinutes.put(TITANIUM, 15);
            meltingTimesMinutes.put(ZINC, 8);
            meltingTimesMinutes.put(NICKEL, 12);
            meltingTimesMinutes.put(LEAD, 6);
            meltingTimesMinutes.put(TIN, 4);
            meltingTimesMinutes.put(BRONZE, 18);
            meltingTimesMinutes.put(BRASS, 16);
            meltingTimesMinutes.put(STEEL, 22);
            meltingTimesMinutes.put(CHROME, 28);
            meltingTimesMinutes.put(ALUMINIUM_BRONZE, 17);
            meltingTimesMinutes.put(PEWTER, 8);
        }

        // Вызываем функцию для плавки каждого металла ( Прояснение )
        public static void main(String[] args) {
            smeltMetal(IRON);
            smeltMetal(COPPER);
            smeltMetal(ALUMINUM);
            smeltMetal(GOLD);
            smeltMetal(SILVER);
            smeltMetal(PLATINUM);
            smeltMetal(TITANIUM);
            smeltMetal(ZINC);
            smeltMetal(NICKEL);
            smeltMetal(LEAD);
            smeltMetal(TIN);
            smeltMetal(BRONZE);
            smeltMetal(BRASS);
            smeltMetal(STEEL);
            smeltMetal(CHROME);
            smeltMetal(ALUMINIUM_BRONZE);
            smeltMetal(PEWTER);
        }

        // Функция для плавки металла ( Представление намерений )
        public static void smeltMetal(int metal) {
            // Получаем название металла
            String metalName;
            switch (metal) {
                case IRON:
                    metalName = "Железо";
                    break;
                case COPPER:
                    metalName = "Медь";
                    break;
                case ALUMINUM:
                    metalName = "Алюминий";
                    break;
                case GOLD:
                    metalName = "Золото";
                    break;
                case SILVER:
                    metalName = "Серебро";
                    break;
                case PLATINUM:
                    metalName = "Платина";
                    break;
                case TITANIUM:
                    metalName = "Титан";
                    break;
                case ZINC:
                    metalName = "Цинк";
                    break;
                case NICKEL:
                    metalName = "Никель";
                    break;
                case LEAD:
                    metalName = "Свинец";
                    break;
                case TIN:
                    metalName = "Олово";
                    break;
                case BRONZE:
                    metalName = "Бронза";
                    break;
                case BRASS:
                    metalName = "Латунь";
                    break;
                case STEEL:
                    metalName = "Сталь";
                    break;
                case CHROME:
                    metalName = "Хром";
                    break;
                case ALUMINIUM_BRONZE:
                    metalName = "Бронза алюминиевая";
                    break;
                case PEWTER:
                    metalName = "Оловянная бронза";
                    break;
                default:
                    metalName = "Неизвестный металл";
            }
            // Выводим информацию о металле
            System.out.println("Начало плавления " + metalName);

            double temperature = meltingTemperatureC.get(metal);
            int time = meltingTimesMinutes.get(metal);
            System.out.println("Температура плавления: " + temperature + " градусов Цельсия");
            System.out.println("Время плавления: " + time + " минут");

            System.out.println(metalName + " плавится...");
            System.out.println(metalName + " плавится...");
            System.out.println(metalName + " плавится...");

            System.out.println(metalName + " плавится полностью!");
            System.out.println("Процесс плавления " + metalName + " завершен.");
        }
    }


    // КОНЕЦ КЛАСС МЕТАЛЛУРГИИ

    // Класс для робота

    //Все коммантарии информативные ибо код крайне тривиален.
    public class VarName3 {

        public class Robot {

            // вес робота
            private int robotWeight;

            // ёмкость батареи робота
            private int robotBatteryCapacity = 100;

            // среднее время между отказами (MTBF) робота
            private int robotMTBF;

            // мощность обработки данных робота
            private int processingPower;

            // ёмкость памяти робота
            private int memoryCapacity;

            // ёмкость хранилища робота
            private int storageCapacity;

            // скорость сети робота
            private int networkSpeed;

            // текущая позиция робота
            private int currentPosition;

            // количество груза робота
            private int cargoAmount;

            // тип робота
            private String robotType;

            // модель робота
            private String robotModel;

            // операционная система робота
            private String operatingSystem;

            // описание задачи робота
            private String robotTaskDescription;

            // версия операционной системы робота
            private String robotOSVersion;

            // тип операционной системы робота
            private String robotOSType;

            // флаг, показывающий, работает ли робот
            private boolean isRobotOperating;

            // флаг, показывающий, заряжена ли батарея робота
            private boolean isBatteryCharged;

            // флаг, показывающий, нашел ли робот цель
            private boolean targetFound;

            // флаг, показывающий, выполнена ли задача робота
            private boolean taskComplete;

            // флаг, показывающий, перегружен ли робот
            private boolean isRobotOverweight;

            // конструктор робота
            public Robot(String robotType, String robotModel, int robotWeight, int processingPower, int memoryCapacity, int storageCapacity, String operatingSystem, int networkSpeed) {
                this.robotType = robotType;
                this.robotModel = robotModel;
                this.robotWeight = robotWeight;
                this.processingPower = processingPower;
                this.memoryCapacity = memoryCapacity;
                this.storageCapacity = storageCapacity;
                this.operatingSystem = operatingSystem;
                this.networkSpeed = networkSpeed;
            }

            // метод, возвращающий полное имя робота
            public String getRobotFullName() {
                return robotType + " " + robotModel;
            }

            // метод, перемещающий робота вперед
            public boolean moveForward(int distance) {
                if (robotBatteryCapacity >= distance) {
                    robotBatteryCapacity -= distance;
                    return true;
                } else {
                    return false;
                }
            }

            // метод, перемещающий робота назад
            public boolean moveBack(int distance) {
                if (robotBatteryCapacity >= distance) {
                    robotBatteryCapacity -= distance;
                    return true;
                } else {
                    return false;
                }
            }

            // метод, перемещающий робота вправо
            public boolean moveRight(int distance) {
                if (robotBatteryCapacity >= distance) {
                    robotBatteryCapacity -= distance;
                    return true;
                } else {
                    return false;
                }
            }

            // метод, перемещающий робота влево
            public boolean moveLeft(int distance) {
                if (robotBatteryCapacity >= distance) {
                    robotBatteryCapacity -= distance;
                    return true;
                } else {
                    return false;
                }
            }

            // метод, проверяющий, может ли робот хранить груз
            public boolean canStoreCargo(int storageCapacity, int cargoLength, int cargoWidth, int cargoHeight) {
                return storageCapacity >= (cargoLength*cargoWidth*cargoHeight);
            }

            // метод, проверяющий, может ли робот выполнить операцию
            public boolean canProcessOperation(int processingPower, int memoryCapacity, int networkSpeed, int taskComplexity) {
                return this.processingPower >= processingPower && this.memoryCapacity >= memoryCapacity && this.networkSpeed >= networkSpeed && taskComplexity <= 100;
            }

            // метод, перемещающий груз
            public boolean moveCargo(int storageCapacity, int cargoLength, int cargoWidth, int cargoHeight) {
                boolean success = false;
                if (canStoreCargo(storageCapacity, cargoLength, cargoWidth, cargoHeight)) {

                    moveForward(2);
                    moveRight(3);

                    success = true;
                    return success;
                }
                return success;
            }

            // метод, заряжающий батарею робота
            public boolean chargeBattery(int robotBatteryCapacity, boolean isRobotOperating) {
                if (isRobotOperating)
                    return false;

                boolean done = false;

                if (robotBatteryCapacity <= 95) {
                    isBatteryCharged = true;
                    return done;
                } else {
                    return done;
                }
            }

            // метод, выгружающий груз робота
            public void unloadCargo(int cargoAmount) {

                for( int unLoadedCargo = 0; unLoadedCargo < cargoAmount; unLoadedCargo++){
                    // логика выгрузки груза
                }

            }

            // метод, проверяющий, перегружен ли робот
            public void checkRobotWeight() {
                if (robotWeight > 100) {
                    isRobotOverweight = true;
                } else {
                    isRobotOverweight = false;
                }
            }

            // метод, проверяющий, заряжена ли батарея робота
            public void checkBatteryStatus() {
                if (robotBatteryCapacity > 10) {
                    isBatteryCharged = true;
                } else {
                    isBatteryCharged = false;
                }
            }

        }

    }






















}
