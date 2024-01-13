package Exception_Handling.Campus_Radio_Frequency_User_deifind_exception;

import java.util.ArrayList;

// Validator class with the validateStation method
class Validator {
    // List of valid frequencies
    private static final ArrayList<Float> validFrequencies = new ArrayList<>(
            java.util.List.of(91.2f, 93.5f, 98.9f, 109.4f));

    public static boolean validateStation(float freq) throws StationNotAvailableException {
        if (validFrequencies.contains(freq)) {
            return true;
        } else {
            throw new StationNotAvailableException("The frequency " + freq + " is out of range");
        }
    }
}