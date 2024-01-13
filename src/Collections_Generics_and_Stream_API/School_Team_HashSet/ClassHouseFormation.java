package Collections_Generics_and_Stream_API.School_Team_HashSet;

import java.util.HashSet;

// ClassHouseFormation class with studSet, addName, and formTeam methods
class ClassHouseFormation {
    private HashSet<String> studSet;

    public ClassHouseFormation() {
        this.studSet = new HashSet<>();
    }

    public HashSet<String> getStudSet() {
        return studSet;
    }

    public void setStudSet(HashSet<String> studSet) {
        this.studSet = studSet;
    }

    public void addName(String details) {
        String[] parts = details.split(":");
        if (parts.length == 2) {
            String name = parts[1].trim();
            studSet.add(name);
        }
    }

    public HashSet<String> formTeam() {
        HashSet<String> result = new HashSet<>();
        for (String name : studSet) {
            String house = determineHouse(name);
            result.add(name + ":" + house);
        }
        return result;
    }

    private String determineHouse(String name) {
        char firstLetter = name.charAt(0);
        if (firstLetter >= 'A' && firstLetter <= 'H') {
            return "RED";
        } else if (firstLetter >= 'I' && firstLetter <= 'P') {
            return "BLUE";
        } else if (firstLetter >= 'Q' && firstLetter <= 'Z') {
            return "GREEN";
        }
        return "UNKNOWN";
    }
}


