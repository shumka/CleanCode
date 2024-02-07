import java.util.HashMap;
import java.util.Map;

public class MetalSmeltingProcess {
    //public static final int Iron = 0;
    public static final int IRON = 0;
    //public static final int Coppper = 1;
    public static final int COPPER = 1;
    //public static final int Aluminum = 2;
    public static final int ALUMINUM = 2;
    //public static final int Gold = 3;
    public static final int GOLD = 3;
    //public static final int Silver = 4;
    public static final int SILVER = 4;
    //public static final int Platinum = 5;
    public static final int PLATINUM = 5;
    //public static final int Titanium = 6;
    public static final int TITANIUM = 6;
    //public static final int Zinc = 7;
    public static final int ZINC = 7;
    //public static final int Nickel = 8;
    public static final int NICKEL = 8;
    //public static final int Lead = 9;
    public static final int LEAD = 9;
    //public static final int Tin = 10;
    public static final int TIN = 10;
    //public static final int Bronze = 11;
    public static final int BRONZE = 11;
    //public static final int Brass = 12;
    public static final int BRASS = 12;
    //public static final int Steel = 13;
    public static final int STEEL = 13;
    //public static final int Chrome = 14;
    public static final int CHROME = 14;
    //public static final int AluminumBronze = 15;
    public static final int ALUMINIUM_BRONZE = 15;

    //public static final int Pewter = 16;
    public static final int PEWTER = 16;

    // Далее все переименовал, как то вообще не задумывался о правиле именования констант и просто называл их с заглавной буквы, чтобы более видно было :)
    // сейчас вижу что как то более логично и систематичнее.

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

        meltingTimesMinutes.put(IRON, 10); // в минутах
        meltingTimesMinutes.put(COPPER, 15); // в минутах
        meltingTimesMinutes.put(ALUMINUM, 5); // в минутах
        meltingTimesMinutes.put(GOLD, 20); // в минутах
        meltingTimesMinutes.put(SILVER, 25); // в минутах
        meltingTimesMinutes.put(PLATINUM, 30); // в минутах
        meltingTimesMinutes.put(TITANIUM, 15); // в минутах
        meltingTimesMinutes.put(ZINC, 8); // в минутах
        meltingTimesMinutes.put(NICKEL, 12); // в минутах
        meltingTimesMinutes.put(LEAD, 6); // в минутах
        meltingTimesMinutes.put(TIN, 4); // в минутах
        meltingTimesMinutes.put(BRONZE, 18); // в минутах
        meltingTimesMinutes.put(BRASS, 16); // в минутах
        meltingTimesMinutes.put(STEEL, 22); // в минутах
        meltingTimesMinutes.put(CHROME, 28); // в минутах
        meltingTimesMinutes.put(ALUMINIUM_BRONZE, 17); // в минутах
        meltingTimesMinutes.put(PEWTER, 8); // в минутах
    }

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

    public static void smeltMetal(int metal) {
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