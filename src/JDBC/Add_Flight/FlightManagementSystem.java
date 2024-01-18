package JDBC.Add_Flight;


import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

class FlightManagementSystem {
    private Properties properties;
    private Connection connection;

    // Constructor to initialize database connection
    public FlightManagementSystem() {
        try {
            properties = new Properties();
            properties.load(new FileInputStream("database.properties"));

            connection = DriverManager.getConnection(
                    properties.getProperty("url"),
                    properties.getProperty("user"),
                    properties.getProperty("password")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to add flight details to the database
    public boolean addFlight(Flight flightObj) {
        try {
            String query = "INSERT INTO flight (flightId, source, destination, noofseats, flightfare) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, flightObj.getFlightId());
            preparedStatement.setString(2, flightObj.getSource());
            preparedStatement.setString(3, flightObj.getDestination());
            preparedStatement.setInt(4, flightObj.getNoOfSeats());
            preparedStatement.setDouble(5, flightObj.getFlightFare());

            int result = preparedStatement.executeUpdate();
            return result > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
