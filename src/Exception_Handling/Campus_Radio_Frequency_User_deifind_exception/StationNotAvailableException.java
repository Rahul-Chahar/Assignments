package Exception_Handling.Campus_Radio_Frequency_User_deifind_exception;

// Custom exception class
class StationNotAvailableException extends Exception {
    public StationNotAvailableException(String message) {
        super(message);
    }
}