package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Find the most populated city of each continent

public class TestStreams {
    public static void main(String[] args) {
        List<Continent> continents = new ArrayList<>();

        // Create fake data for cities and continents
        Continent asia = new Continent("Asia");
        asia.addCity(new City("Tokyo", 37435191));
        asia.addCity(new City("Shanghai", 27383198));
        asia.addCity(new City("Delhi", 30290936));

        Continent africa = new Continent("Africa");
        africa.addCity(new City("Lagos", 14072000));
        africa.addCity(new City("Cairo", 9727000));
        africa.addCity(new City("Kinshasa", 14816000));
        africa.addCity(new City("Uganda",1244));

        Continent europe = new Continent("Europe");
        europe.addCity(new City("Istanbul", 15462464));
        europe.addCity(new City("London", 8982000));
        europe.addCity(new City("Moscow", 12615279));

        continents.add(asia);
        continents.add(africa);
        continents.add(europe);

        mostPopulatedCityOfEachContinent(continents);
        leastPopulatedCityOfEachContinent(continents);
        findCitiesOfaSpecificContient(continents);
        findCitiesOfaSpecificContientWithName(continents);
        continentWithMostNumberOfCities(continents);

    }

    private static void continentWithMostNumberOfCities(List<Continent> continents) {
        continents.stream().collect(Collectors.toMap(
                continent -> continent,continent -> continent.getCities().size()
        ));
    }

    private static void findCitiesOfaSpecificContientWithName(List<Continent> continents) {
        var ans=continents.stream().filter(s->s.getName().equalsIgnoreCase("Africa")).flatMap(continent -> continent.getCities().stream()).collect(Collectors.toList());
        System.out.println("Africa Result-->"+ans);

    }

    private static void findCitiesOfaSpecificContient(List<Continent> continents) {
        var cities=continents.stream().collect(Collectors.toMap(Continent::getName,continent -> continent.getCities().stream().map(City::getName).collect(Collectors.toList())));
        System.out.println(cities);
    }

    private static void leastPopulatedCityOfEachContinent(List<Continent> continents) {
        var ans=continents.stream().collect(Collectors.toMap(Continent::getName,continent -> continent.getCities().stream()
                .min(Comparator.comparing(City::getPopulation)).orElse(null)));

        System.out.println("Leeast Populated"+ans);
    }

    private static void mostPopulatedCityOfEachContinent(List<Continent> continents) {
        var ans=continents.stream().collect(Collectors.toMap(
                Continent::getName,continent -> continent.getCities().stream()
                        .max(Comparator.comparing(City::getPopulation)).orElse(null)
        ));
        System.out.println(ans);
    }




}
