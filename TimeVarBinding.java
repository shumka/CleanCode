import java.util.HashMap;
import java.util.Map;

public class TimeVarBinding {



    // OLD CODE
    public class Microcontroller {

        int mcfreqSpeedMHz;
        int mcBitDepth;
        int mcSRAM;
        int mcflashMemory;
        String mcCompanyCreator;
        private String mcName;
        int mcNumberOfCores;
        boolean mcHasWiFi;
        boolean mcHasEthernet;

        public String getName() {
            return mcName;
        }
        public void setName(String name) {
            this.mcName= name;
        }
        protected int mcYearOfCreate; //YEAR
        protected String mcFullName;
        public static int mcExpirationDate; //in Years
        Microcontroller() {
            mcfreqSpeedMHz = 100;
            mcBitDepth = 64;
            mcCompanyCreator = "ASUSTek";
            mcName = "Microcontroller" + mcCompanyCreator;
            mcYearOfCreate = 2000;
            mcExpirationDate = 5;
            mcFullName = "company_Creator" + "Microcontroller" + Integer.toString(mcYearOfCreate) + "till" + Integer.toString(mcYearOfCreate + mcExpirationDate);
        }
        Microcontroller(int yearOfCreate, int expirationDate, String fullName, String name) {
            this.mcYearOfCreate = yearOfCreate;
            Microcontroller.mcExpirationDate = expirationDate;
            this.mcFullName = fullName;
            this.mcName = name;
        }
        Microcontroller(int yearOfCreate, int expirationDate, String fullName, String mcName, int mcBitDepth, int mcfreqSpeed) {
            this(yearOfCreate,expirationDate,fullName,mcName);
            this.mcBitDepth = mcBitDepth;
            this.mcfreqSpeedMHz = mcfreqSpeed;
        }
        public String toString(){
            return "Ì³êðîêîíòðîëëåð ô³ðìè - " + this.mcCompanyCreator + ", ñòâîðåíèé ó " + this.mcYearOfCreate + " ³ç òàêòîâîþ ÷àñòîòîþ: " + this.mcfreqSpeedMHz + "Ìãö , ³ ðîçðÿäí³ñòþ " + this.mcBitDepth + ". Òåðì³í ïðèäàòíîñò³ äàíîãî êîòðîëëåðà " + Microcontroller.mcExpirationDate + " Ðîê³â. ";
        }
        public void printStaticExpirationDate() {
            System.out.print("Òåðì³í ïðèäàòíîñò³ - " + Microcontroller.mcExpirationDate + " ðîê³â.");
        }
        public void printExpirationDate() {
            System.out.print(Integer.toString(Microcontroller.mcExpirationDate));
        }
        public void ResetValues(int yearOfCreate, int expirationDate, String fullName, String mcName, int mcBitDepth, int mcfreqSpeed) {
            this.mcYearOfCreate = yearOfCreate;
            Microcontroller.mcExpirationDate = expirationDate;
            this.mcFullName = fullName;
            this.mcName = mcName;
            this.mcBitDepth = mcBitDepth;
            this.mcfreqSpeedMHz = mcfreqSpeed;
        }
        public static void main(String[] args) {
            Microcontroller NewController = new Microcontroller();
            NewController.ResetValues(1990, 10, "Dell NewController from 1990 year", "dell", 64, 8064);
            Microcontroller secondController = new Microcontroller(1975, 15, "new Controller from Second constructor", "HP");
            Microcontroller thirdController = new Microcontroller(1975, 15, "new Controller from Second constructor", "HP", 64, 8064);
            System.out.print(secondController.toString());
            thirdController.printStaticExpirationDate();
            secondController.printStaticExpirationDate();
        }
    }

    //NEW CODE. Была уменьшена видимость переменных, сами переменные переименованы, также были сгруппированы связанные методы для управления данными экземпляров класса


    public class Microcontroller {

        private int frequencySpeedMHz;
        private int bitDepth;
        private int sram;
        private int flashMemory;
        private String companyCreator;
        private String name;
        private int numberOfCores;
        private boolean hasWiFi;
        private boolean hasEthernet;
        private int yearOfCreate;
        private String fullName;
        private static int expirationDate;

        public Microcontroller() {
            this.frequencySpeedMHz = 100;
            this.bitDepth = 64;
            this.companyCreator = "ASUSTek";
            this.name = "Microcontroller" + companyCreator;
            this.yearOfCreate = 2000;
            expirationDate = 5;
            this.fullName = companyCreator + " Microcontroller " + yearOfCreate + " till " + (yearOfCreate + expirationDate);
        }

        public Microcontroller(int yearOfCreate, int expirationDate, String fullName, String name, int bitDepth, int frequencySpeed) {
            this(yearOfCreate, expirationDate, fullName, name);
            this.bitDepth = bitDepth;
            this.frequencySpeedMHz = frequencySpeed;
        }

        public String toString() {
            return "Microcontroller company - " + companyCreator + ", created in " + yearOfCreate + " with speed: " + frequencySpeedMHz + "MHz , and bit depth " + bitDepth + ". Validity period of this device " + expirationDate + " Years. ";
        }

        public static void printStaticExpirationDate() {
            System.out.print("Expiration date is " + expirationDate + " years.");
        }

        public void printExpirationDate() {
            System.out.print(expirationDate);
        }

        public void resetValues(int yearOfCreate, int expirationDate, String fullName, String name, int bitDepth, int frequencySpeed) {
            this.yearOfCreate = yearOfCreate;
            expirationDate = expirationDate;
            this.fullName = fullName;
            this.name = name;
            this.bitDepth = bitDepth;
            this.frequencySpeedMHz = frequencySpeed;
        }

        public static void main(String[] args) {
            Microcontroller newController = new Microcontroller();
            newController.resetValues(1990, 10, "Dell NewController from 1990 year", "dell", 64, 8064);
            Microcontroller secondController = new Microcontroller(1975, 15, "new Controller from Second constructor", "HP");
            System.out.println(secondController.toString());
            secondController.printStaticExpirationDate();
        }
    }

}
