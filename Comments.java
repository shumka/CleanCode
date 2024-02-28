public class Comments {

    // Создаем класс персонажа
    public class Character {
        protected String name; // Имя персонажа
        protected int health; // Здоровье персонажа
        protected int damage; // Урон персонажа

        // Конструктор класса Character
        public Character(String name, int health, int damage) {
            this.name = name;
            this.health = health;
            this.damage = damage;
        }

        // Метод для атаки другого персонажа
        public void attack(Character enemy) {
            enemy.health -= this.damage;
            System.out.println(this.name + " атакует " + enemy.name + " и наносит " + this.damage + " урона.");
        }

        // Метод для проверки жив ли персонаж
        public boolean isAlive() {
            return health > 0;
        }
    }

    // Создаем класс Воина, который является подклассом персонажа
    public class Warrior extends Character {
        // Конструктор класса Warrior
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

    // Создаем класс Мага, также являющийся подклассом персонажа
    public class Mage extends Character {
        // Конструктор класса Mage
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

    // Создаем класс Лучника, также являющийся подклассом персонажа
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
            // Создаем экземпляры персонажей: воин, маг и лучник
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

}
