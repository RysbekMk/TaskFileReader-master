// TODO: 19.08.2023
//  Реализовать readFile(). Логика проста...
//  Вытащить данные из текстового файла и записать их к объекту класса City.
//  Небольшая подсказказка можно использовать метод .split() класса String.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

// TODO: 19.08.2023
//  После того как ты закончил предыдущий метод можешь приступить к следуещему.
//  Вся суть printAllCities() заключается в том, что надо вывести все города на консоль.
public class CityMethodsImpl implements CityMethods {
    private final String fileName;

    public CityMethodsImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<City> readFile() throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);
        Scanner scanner = new Scanner(reader);
        List<City> cities = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String words = scanner.nextLine();
            List<String> cityList = List.of(words.split(";"));
            City city = new City();
            city.setID(Integer.parseInt(cityList.get(0)));
            city.setName(cityList.get(1));
            city.setRegion(cityList.get(2));
            city.setDistrict(cityList.get(3));
            city.setPopulation(Integer.parseInt(cityList.get(4)));
            try {
                city.setFOUNDATION((cityList.get(5)));
            } catch (ArrayIndexOutOfBoundsException a) {
                city.setFOUNDATION(" ");
            }
            cities.add(city);
        }
        return cities;
    }

    @Override
    public void printAllCities(List<City> cities) {
        for (City city : cities) {
            System.out.println(city.getName());
        }

    }

    @Override
    public void groupByRegion(List<City> cities) throws FileNotFoundException {
        cities = new LinkedList<>(readFile());
        Map<String, Integer> hashMap = new TreeMap<>();
        int count = 0;
        for (int i = 1; i < cities.size(); i++) {
            if (!cities.get(i - 1).getRegion().equals(cities.get(i).getRegion())) {
                hashMap.put(cities.get(i - 1).getRegion(), count + 1);
                count = 0;
            } else {
                count++;
            }
        }
        for (String s : hashMap.keySet()) {
            System.out.println(s + " have [" + hashMap.get(s) + "]- cities");
        }
    }

    @Override
    public void searchByName(String name) {
        List<City> cities;
        try {
            cities = new LinkedList<>(readFile());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (City city : cities) {
            if (city.getName().equalsIgnoreCase(name)) {
                System.out.println(city);
            }
        }


    }
}
