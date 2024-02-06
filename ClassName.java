public class ClassName {

    //BAD CLASS
    public class RocketManager {
        public void launchRocket() {
            System.out.println("Rocket is launching!");
        }

        public void controlRocket() {
            System.out.println("Rocket is being controlled!");
        }
    }
    //GOOD CLASS
    public class Rocket {
        public void launch() {
            System.out.println("Launching rocket!");
        }

        public void control() {
            System.out.println("Controlling rocket!");
        }
    }

    //BAD CLASS
    public class RocketProcessor {
        public void processRocketData() {
            System.out.println("Processing rocket data!");
        }

        public void optimizeRocketPerformance() {
            System.out.println("Optimizing rocket performance!");
        }
    }

    //GOOD CLASS
    public class RocketDataProcessor {
        public void process() {
            System.out.println("Processing rocket data!");
        }

        public void optimizePerformance() {
            System.out.println("Optimizing rocket performance!");
        }
    }

    //BAD CLASS
    public class RocketDriver {
        public void driveRocket() {
            System.out.println("Driving the rocket!");
        }

        public void monitorRocketSystems() {
            System.out.println("Monitoring rocket systems!");
        }
    }

    //GOOD CLASS
    public class RocketPilot {
        public void operate() {
            System.out.println("Operating the rocket!");
        }

        public void monitorSystems() {
            System.out.println("Monitoring rocket systems!");
        }
    }


    //BAD CLASS
    public class SpaceController {
        public void controlRocket() {
            System.out.println("Controlling rocket!");
        }

        public void adjustRocketTrajectory() {
            System.out.println("Adjusting rocket trajectory!");
        }
    }

    //GOOD CLASS
    public class RocketController {
        public void control() {
            System.out.println("Controlling rocket!");
        }

        public void adjustTrajectory() {
            System.out.println("Adjusting rocket trajectory!");
        }
    }

    //BAD CLASS
    public class SpaceRocketNavigator  {

        public void navigateRocket() {
            System.out.println("Navigating the rocket!");
        }

        public void calculateRocketPath() {
            System.out.println("Calculating rocket path!");
        }
    }
    //GOOD CLASS
    public class RocketNavigator {
        public void navigate() {
            System.out.println("Navigating the rocket!");
        }

        public void calculatePath() {
            System.out.println("Calculating rocket path!");
        }
    }


}
