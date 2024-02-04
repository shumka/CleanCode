public class VarName3 {

    public class Robot {

        private int robotWeight;
        private int robotBatteryCapacity = 100;
        private int robotMTBF;
        private int processingPower;
        private int memoryCapacity;
        private int storageCapacity;
        private int networkSpeed;
        private int currentPosition;
        private int cargoAmount;



        private String robotType;
        private String robotModel;
        private String operatingSystem;
        private String robotTaskDescription;
        private String robotOSVersion;
        private String robotOSType;


        //7.1
        private boolean isRobotOperating;
        //7.4 private boolean isRobotStopped;

        private boolean isBatteryCharged;
        //7.4 private boolean isBatteryDischarged;

        private boolean targetFound;
        private boolean taskComplete;
        private boolean isRobotOverweight;

        // END 7.1 & 7.4

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

        public boolean canProcessOperation(int processingPower, int memoryCapacity, int networkSpeed, int taskComplexity) {
            return this.processingPower >= processingPower && this.memoryCapacity >= memoryCapacity && this.networkSpeed >= networkSpeed && taskComplexity <= 100;
        }


        //7.2
        public boolean moveCargo(int storageCapacity, int cargoLength, int cargoWidth, int cargoHeight) {
            boolean success = false;
            if (canStoreCargo(storageCapacity, cargoLength, cargoWidth, cargoHeight)) {
                // условное перемещение
                moveForward(2);
                moveRight(3);

                success = true;
                return success;
            }
            return success;
        }

        //7.2
        public boolean chargeBattery(int robotBatteryCapacity, boolean isRobotOperating) {
            if (isRobotOperating)
                return false;

            boolean done = false;

            if (robotBatteryCapacity <= 95) {
                //moveToChargingStation(currentPosition);
                //done = startCharge();
                isBatteryCharged = true;
                return done;
            } else {
                return done;
            }
        }

        //7.3
        public void unloadCargo(int cargoAmount) {

            //Было
            for( int i = 0; i < cargoAmount; i++){
                // логика выгрузки груза
                cargoAmount--;
            }

            //Стало
            for( int unLoadedCargo = 0; unLoadedCargo < cargoAmount; unLoadedCargo++){
                // логика выгрузки груза
            }

        }


        //7.5
        public void checkRobotWeight() {
            if (robotWeight > 100) {
                isRobotOverweight = true;
            } else {
                isRobotOverweight = false;
            }
        }

        public void checkBatteryStatus() {
            if (robotBatteryCapacity > 10) {
                isBatteryCharged = true;
            } else {
                isBatteryCharged = false;
            }
        }


    }

}
