public class DataType {

    // Класс Воин
    public class Warrior {
        private String name;
        private int health;
        private int strength;
        //private float armor;

        //увеличение точности путем float > double
        private double armor;

        //private float attackSpeed;

        //увеличение точности
        private double attackSpeed;


        //private float criticalChance;
        private double criticalChance;

        //увеличение точности
        //private float dodgeChance;
        private double dodgeChance;
        private char combatSymbol;
        private char statusSymbol;
        private boolean isStunned;
        private boolean isBleeding;
        private boolean isDefending;


        public Warrior(String name, int health, int strength, double armor, double attackSpeed, double criticalChance, double dodgeChance) {
            this.name = name;
            this.health = health;
            this.strength = strength;
            this.armor = armor;
            this.attackSpeed = attackSpeed;
            this.criticalChance = criticalChance;
            this.dodgeChance = dodgeChance;
        }

        // Метод атаки
        public void attack() {
            System.out.println(name + " атакует противника!");
        }

        public void useArmorItem(double armorIncrease) {
            armor += armorIncrease;
            System.out.println(name + " использовал предмет, увеличивающий броню. Новое значение брони: " + armor);
        }

        // Пример сложных логически переменных
        private boolean isBerserk = !isStunned && isBleeding;


        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public int getStrength() {
            return strength;
        }

        public double getArmor() {
            return armor;
        }

        public double getAttackSpeed() {
            return attackSpeed;
        }

        public double getCriticalChance() {
            return criticalChance;
        }

        public double getDodgeChance() {
            return dodgeChance;
        }
    }

    // Класс Маг
    public class Mage {
        private String name;
        private int health;
        private int spellPower;

        //private float manaPool;

        //Увеличение точности
        private double manaPool;

        //private float spellCooldown;

        // Увеличение точности
        private double spellCooldown;

        private double spellManaCost;

        private char spellSymbol;
        private char statusSymbol;
        private boolean isCasting;
        private boolean isSilenced;
        private boolean isChannelling;
        private boolean isOverloaded;


        public Mage(String name, int health, int spellPower, double manaPool, double spellCooldown) {
            this.name = name;
            this.health = health;
            this.spellPower = spellPower;
            this.manaPool = manaPool;
            this.spellCooldown = spellCooldown;
        }

        // Метод заклинания
        public void castSpell() {
            System.out.println(name + " произносит заклинание!");
        }

        // Метод для восстановления маны после использования заклинания
        public void regenerateMana(double manaRegen) {
            manaPool += manaRegen;
            System.out.println(name + " восстанавливает ману. Новое значение маны: " + manaPool);
        }

        // Пример сложных логически переменных
        private boolean canCast = !isSilenced && !isOverloaded && manaPool > spellManaCost;

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public int getSpellPower() {
            return spellPower;
        }

        public double getManaPool() {
            return manaPool;
        }

        public double getSpellCooldown() {
            return spellCooldown;
        }
    }

    // Класс Лучник
    public class Archer {
        private String name;
        private int health;
        private int agility;

        private int arrows;

        //private float critMultiplier;
        //увеличение точности
        private double critMultiplier;

        //private float attackRange;

        //увеличение точности
        private double attackRange;

        //private float projectileSpeed;
        //увеличение точности
        private double projectileSpeed;
        private char shotSymbol;
        private char statusSymbol;
        private boolean isHunting;
        private boolean isReloading;
        private boolean isAiming;
        private boolean isStealthed;

        // Конструктор
        public Archer(String name, int health, int agility, int arrows, double critMultiplier, double attackRange, double projectileSpeed) {
            this.name = name;
            this.health = health;
            this.agility = agility;
            this.arrows = arrows;
            this.critMultiplier = critMultiplier;
            this.attackRange = attackRange;
            this.projectileSpeed = projectileSpeed;
        }

        // Метод выстрела из лука
        public void shootArrow() {
            System.out.println(name + " выпускает стрелу из лука!");
        }

        // Метод для прицеливания
        public void aim(double distance) {
            if (distance <= attackRange) {
                System.out.println(name + " прицеливается на " + distance + " метров.");
            } else {
                System.out.println(name + " не может прицелиться так далеко.");
            }
        }


        // Пример сложных логически переменных
        private boolean canShootArrow = health > 0 && agility >= 10;

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public int getAgility() {
            return agility;
        }

        public double getCritMultiplier() {
            return critMultiplier;
        }

        public double getAttackRange() {
            return attackRange;
        }

        public double getProjectileSpeed() {
            return projectileSpeed;
        }
    }

}
