import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

/**
 * УДАЧИ ТЕБЕ
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
CityMethodsImpl cityMethods = new CityMethodsImpl();
cityMethods.groupByRegion(cityMethods.readFile());
    }
}