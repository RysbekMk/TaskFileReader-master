// TODO: 19.08.2023
//  надо создать класс City с полями:
//  ID, NAME, REGION, DISTRICT, POPULATION, FOUNDATION.
//  Класс должен отвечать принципу инкапсуляции и иметь метод toString().
public class City {
    private int ID;
    private String NAME;
    private String REGION;
    private String DISTRICT;
    private int POPULATION;
    private String FOUNDATION;

    public City(int id, String name, String region, String district, int population, String name1, int population1, String foundation) {
        this.ID = id;
        this.NAME = name;
        this.REGION = region;
        this.DISTRICT = district;
        this.POPULATION = population;
        this.FOUNDATION = foundation;
    }

    public City() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return NAME;
    }

    public void setName(String name) {
        this.NAME = name;
    }

    public String getRegion() {
        return REGION;
    }

    public void setRegion(String region) {
        this.REGION = region;
    }

    public String getDistrict() {
        return DISTRICT;
    }

    public void setDistrict(String district) {
        this.DISTRICT = district;
    }

    public int getPopulation() {
        return POPULATION;
    }

    public void setPopulation(int population) {
        this.POPULATION = population;
    }

    public String getFOUNDATION() {
        return FOUNDATION;
    }

    public void setFOUNDATION(String FOUNDATION) {
        this.FOUNDATION = FOUNDATION;
    }

    @Override
    public String toString() {
        return "\nCity: " +
                "\u001B[034m" + "ID=[" + "\u001B[0m" + ID +
                "\u001B[034m" +"],  NAME=[" + "\u001B[0m" + NAME + '\'' +
                "\u001B[034m" + "],    REGION=[" + "\u001B[0m" + REGION + '\'' +
                "\u001B[034m" + "],    district=[" + "\u001B[0m" + DISTRICT + '\'' +
                "\u001B[034m" + "],    population=[" + "\u001B[0m" + POPULATION +
                "\u001B[034m" + "],    FOUNDATION=[" + "\u001B[0m" + FOUNDATION + '\'' +
                "\u001B[034m" + ']' + "\u001B[0m";
    }
}
