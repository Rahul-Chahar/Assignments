package Collections_Generics_and_Stream_API.Car_Survey_TreeMap;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.ArrayList;

// Car class with carMap, addCar, carByName, carByCount, and totalCarsSold methods
class Car {
    private Map<String, Integer> carMap;

    public Car() {
        this.carMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    public Map<String, Integer> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<String, Integer> carMap) {
        this.carMap = carMap;
    }

    public void addCar(String carName, int num) {
        if (num > 0) {
            carMap.put(carName, num);
        }
    }

    public int carByName(String carName) {
        return carMap.getOrDefault(carName, -1);
    }

    public List<String> carByCount(int count) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : carMap.entrySet()) {
            if (entry.getValue() >= count) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public int totalCarsSold() {
        int total = 0;
        for (int num : carMap.values()) {
            total += num;
        }
        return total;
    }
}

