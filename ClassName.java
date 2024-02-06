public class ClassName {

    //BAD CLASS AND METHODS
    public class RocketManager {
        public void flyRocketToOrbit() {
            System.out.println("Ракета поднимается на орбиту");
        }
    }

    public class ControlSystem {
        public void startEngine() {
            System.out.println("Двигатель запущен");
        }
    }

    public class OrbitalManager {
        public void navigateToOrbit() {
            System.out.println("Навигация к околоземной орбите");
        }
    }

    public class SpaceDriver {
        public void controlRocket() {
            System.out.println("Управление ракетой");
        }
    }

    public class SpaceProcessor {
        public void launchRocket() {
            System.out.println("Запуск ракеты");
        }
    }


    //CLEAN CODE ZEN
    public class Rocket {
        public void launchToOrbit() {
            System.out.println("Ракета поднимается на орбиту");
        }
    }

    public class EngineControlSystem {
        public void start() {
            System.out.println("Двигатель запущен");
        }
    }

    public class OrbitalNavigator {
        public void navigateToOrbit() {
            System.out.println("Навигация к околоземной орбите");
        }
    }

    public class Pilot {
        public void operateRocket() {
            System.out.println("Управление ракетой");
        }
    }

    public class RocketLauncher {
        public void launch() {
            System.out.println("Запуск ракеты");
        }
    }



}
