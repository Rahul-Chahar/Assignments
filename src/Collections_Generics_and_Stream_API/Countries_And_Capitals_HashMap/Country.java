package Collections_Generics_and_Stream_API.Countries_And_Capitals_HashMap;

import java.util.HashMap;
import java.util.Map;

// Country class with countryMap, add, and search methods
class Country {
    private Map<String, String> countryMap;

    public Country() {
        this.countryMap = new HashMap<>();
    }

    public Map<String, String> getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(Map<String, String> countryMap) {
        this.countryMap = countryMap;
    }

    public void add(String countryName, String capitalName) {
        countryMap.put(countryName.toLowerCase(), capitalName);
    }

    public String search(String countryName) {
        if (countryMap.isEmpty()) {
            return "The map is empty";
        }

        String capital = countryMap.get(countryName.toLowerCase());
        return capital != null ? capital : "Data not found";
    }
}


