// Интерфейс, представляющий общие характеристики робота
interface Robot {
    void introduce();
}

// Абстрактный класс, реализующий базовые методы для роботов
abstract class AbstractRobot implements Robot {
    protected String name;

    public AbstractRobot(String name) {
        this.name = name;
    }

    @Override
    public void introduce() {
        System.out.println("Привет, я робот по имени " + name);
    }
}

// Фабрика для создания роботов-пылесосов
class VacuumRobotFactory {
    public static Robot createVacuumRobot(String name) {
        return new VacuumRobot(name);
    }
}

// Реализация робота-пылесоса
class VacuumRobot extends AbstractRobot {
    public VacuumRobot(String name) {
        super(name);
    }

    // Дополнительные методы и поведение для робота-пылесоса
    public void clean() {
        System.out.println("Я робот-пылесос и я начинаю уборку!");
    }
}

// Фабрика для создания роботов-пожарных
class FirefighterRobotFactory {
    public static Robot createFirefighterRobot(String name) {
        return new FirefighterRobot(name);
    }
}

// Реализация робота-пожарного
class FirefighterRobot extends AbstractRobot {
    public FirefighterRobot(String name) {
        super(name);
    }

    // Дополнительные методы и поведение для робота-пожарного
    public void extinguishFire() {
        System.out.println("Я робот-пожарный и я тушу пожар!");
    }
}

// Фабрика для создания роботов-грузовиков
class TruckRobotFactory {
    public static Robot createTruckRobot(String name) {
        return new TruckRobot(name);
    }
}

// Реализация робота-грузовика
class TruckRobot extends AbstractRobot {
    public TruckRobot(String name) {
        super(name);
    }

    // Дополнительные методы и поведение для робота-грузовика
    public void transportGoods() {
        System.out.println("Я робот-грузовик и я перевожу груз!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание робота-пылесоса с помощью фабрики
        Robot vacuumRobot = VacuumRobotFactory.createVacuumRobot("Пылесос 3000");
        vacuumRobot.introduce();
        ((VacuumRobot) vacuumRobot).clean();

        // Создание робота-пожарного с помощью фабрики
        Robot firefighterRobot = FirefighterRobotFactory.createFirefighterRobot("Огнеборец 2000");
        firefighterRobot.introduce();
        ((FirefighterRobot) firefighterRobot).extinguishFire();

        // Создание робота-грузовика с помощью фабрики
        Robot truckRobot = TruckRobotFactory.createTruckRobot("Грузовичок");
        truckRobot.introduce();
        ((TruckRobot) truckRobot).transportGoods();
    }
}