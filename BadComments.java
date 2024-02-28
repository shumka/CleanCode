public class BadComments {


    // Исправления из файла comments.java, по сути львиная доля комментариев не нужна - по коду все понятно


    public class Character {
        protected String name; // Имя персонажа --------- ОЧЕВИДНО подлежит удалению
        protected int health; // Здоровье персонажа --------- ОЧЕВИДНО подлежит удалению
        protected int damage; // Урон персонажа --------- ОЧЕВИДНО подлежит удалению

        // Конструктор класса Character --------- ОЧЕВИДНО подлежит удалению
        public Character(String name, int health, int damage) {
            this.name = name;
            this.health = health;
            this.damage = damage;
        }

        // Метод для атаки другого персонажа --------- ОЧЕВИДНО подлежит удалению
        public void attack(Character enemy) {
            enemy.health -= this.damage;
            System.out.println(this.name + " атакует " + enemy.name + " и наносит " + this.damage + " урона.");
        }

        // Метод для проверки жив ли персонаж --------- ОЧЕВИДНО подлежит удалению
        public boolean isAlive() {
            return health > 0;
        }
    }

    // Создаем класс Воина, который является подклассом персонажа --------- ОЧЕВИДНО подлежит удалению
    public class Warrior extends Character {
        // Конструктор класса Warrior --------- ОЧЕВИДНО подлежит удалению
        public Warrior(String name) {
            super(name, 100, 20); // Воин начинает с 100 здоровья и 20 урона
        }

        // Метод для специальной атаки воина
        public void specialAttack(Character enemy) {
            int specialDamage = this.damage * 2; // Удвоенный урон для специальной атаки
            enemy.health -= specialDamage;
            System.out.println(this.name + " использовал специальную атаку на " + enemy.name + " и нанес " + specialDamage + " урона.");
        }
    }

    // Создаем класс Мага, также являющийся подклассом персонажа --------- ОЧЕВИДНО подлежит удалению
    public class Mage extends Character {
        // Конструктор класса Mage --------- ОЧЕВИДНО подлежит удалению
        public Mage(String name) {
            super(name, 80, 30); // Маг начинает с 80 здоровья и 30 урона
        }

        // Метод для лечения союзников
        public void heal(Character ally) {
            int healingPower = 25; // Сила лечения мага
            ally.health += healingPower;
            System.out.println(this.name + " исцеляет " + ally.name + " на " + healingPower + " здоровья.");
        }
    }

    // Создаем класс Лучника, также являющийся подклассом персонажа --------- ОЧЕВИДНО подлежит удалению
    public class Archer extends Character {
        // Конструктор класса Archer
        public Archer(String name) {
            super(name, 90, 25); // Лучник начинает с 90 здоровья и 25 урона
        }

        // Метод для стрельбы из лука
        public void shoot(Character enemy) {
            int arrowDamage = this.damage + 5; // Урон стрелы лучника с учетом дополнительного урона
            enemy.health -= arrowDamage;
            System.out.println(this.name + " стреляет в " + enemy.name + " и наносит " + arrowDamage + " урона.");
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Создаем экземпляры персонажей: воин, маг и лучник --------- ОЧЕВИДНО подлежит удалению
            Warrior warrior = new Warrior("Воин");
            Mage mage = new Mage("Маг");
            Archer archer = new Archer("Лучник");

            // Начало битвы

            while (warrior.isAlive() && mage.isAlive() && archer.isAlive()) {
                // Ход игры: каждый персонаж атакует случайного врага
                Character attacker;
                Character target;
                double random = Math.random();
                if (random < 0.33) {
                    attacker = warrior;
                    target = mage;
                } else if (random < 0.66) {
                    attacker = mage;
                    target = archer;
                } else {
                    attacker = archer;
                    target = warrior;
                }
                attacker.attack(target);
            }

            // Определение победителя

            if (warrior.isAlive()) {
                System.out.println("Победил воин!");
            } else if (mage.isAlive()) {
                System.out.println("Победил маг!");
            } else if (archer.isAlive()) {
                System.out.println("Победил лучник!");
            } else {
                System.out.println("Ничья!");
            }
        }
    }


    // Исправление в коде MetalSmeltingProcess.java

    //  Класс для металлургии
    public class MetalSmeltingProcess {


        // TODO: Добавить поддержку для новых типов металлов ----- ЯВЛЯЕТСЯ НЕОЧЕВИДНЫМ КОММЕНТАРИЕМ
        // сделать ее более логичной ( все металлы как то можно сгрупирровать и назначать номер как то логичнее
        // таблица менделеева или оное...)
        // В будущем это должен быть идеальный код для плавления того или иного металла планета Земля ---- Недостоверный комментарий, нет указания каким способом я улучшу код


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

        // Вызываем функцию для плавки каждого металла ( Прояснение ) ------ БОРМОТАНИЕ
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

        // Функция для плавки металла ( Представление намерений ) ----- СЛИШКОМ МНОГО ИИФНОРМАЦИИ
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



}
