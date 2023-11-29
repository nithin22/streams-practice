package Streams;

import java.util.ArrayList;
import java.util.List;

public class Continent {
        private String name;
        private List<City> cities = new ArrayList<>();

        public Continent(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public List<City> getCities() {
            return cities;
        }

        public void addCity(City city) {
            cities.add(city);
        }

        @Override
        public String toString() {
            return name;
        }
    }
