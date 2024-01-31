class VarName2 {

    // 6.1

    public class Robot {

        private String robotType;
        private String robotModel;

        private int robotWeight;
        private int robotBatteryCapacity = 100;

        //6.4
        //private int robotMeanTimeBetweenFailures;
        private int robotMTBF;
        //private boolean isRobotCurrentlyOperating;
        private boolean isRobotOperating;
        //private String robotCurrentlyAssignedTask
        private String robotTaskDescription;
        //private  String robotOperatingSystemVersion;
        private String robotOSVersion;
        //private String robotOperatingSystemType;
        private String robotOSType;


        // 6.2
        private int processingPower;
        private int memoryCapacity;
        private int storageCapacity;
        private String operatingSystem;
        private int networkSpeed;
        // END 6.2

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

        public String getRobotFullName() {
            return robotType + " " + robotModel;
        }

        public boolean moveForward(int distance) {
            if (robotBatteryCapacity >= distance) {
                robotBatteryCapacity -= distance;
                return true;
            } else {
                return false;
            }
        }

        public boolean moveBack(int distance) {
            if (robotBatteryCapacity >= distance) {
                robotBatteryCapacity -= distance;
                return true;
            } else {
                return false;
            }
        }

        public boolean moveRight(int distance) {
            if (robotBatteryCapacity >= distance) {
                robotBatteryCapacity -= distance;
                return true;
            } else {
                return false;
            }
        }
        //6.3
        public boolean moveLeft(int distance) {
            if (robotBatteryCapacity >= distance) {
                robotBatteryCapacity -= distance;
                return true;
            } else {
                return false;
            }
        }

        public boolean canStoreCargo(int storageCapacity, int cargoLength, int cargoWidth, int cargoHeight) {
            return storageCapacity >= (cargoLength*cargoWidth*cargoHeight);
        }

        //6.3
        public boolean canProcessOperation(int processingPower, int memoryCapacity, int networkSpeed, int taskComplexity) {
            return this.processingPower >= processingPower && this.memoryCapacity >= memoryCapacity && this.networkSpeed >= networkSpeed && taskComplexity <= 100;
        }



    }


}