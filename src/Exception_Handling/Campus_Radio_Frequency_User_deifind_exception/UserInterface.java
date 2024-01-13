package Exception_Handling.Campus_Radio_Frequency_User_deifind_exception;

// Main class to handle user input and invoke the validateStation method
 class UserInterface {
    public static void main(String[] args) {
        System.out.println("Scan the radio station");

        try {
            float inputFrequency = Float.parseFloat(System.console().readLine().trim());

            if (Validator.validateStation(inputFrequency)) {
                System.out.println(inputFrequency + " is the right frequency");
            }
        } catch (StationNotAvailableException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid frequency.");
        }
    }
}
