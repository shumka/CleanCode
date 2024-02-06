
public class Microcontroller {

    //int taktova_Chastota;
    int mcfreqSpeedMHz;

    //int rozriadnist;
    int mcBitDepth;

    //int pamat_RAM;
    int mcSRAM;

    //int flash_pamat;
    int mcflashMemory;

    //String company_Creator;
    String mcCompanyCreator;

    //private String name;
    private String mcName;

    //int kolvo_Yader;
    int mcNumberOfCores;

    //boolean est_Wifi;
    boolean mcHasWiFi;

    //boolean est_Ethernet;
    boolean mcHasEthernet;


    public String getName() {
        return mcName;
    }
    public void setName(String name) {
        this.mcName= name;
    }
    //protected int yearOfCreate;
    protected int mcYearOfCreate; //YEAR

    //protected String fullName;
    protected String mcFullName;

    //public static int expirationDate;
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
