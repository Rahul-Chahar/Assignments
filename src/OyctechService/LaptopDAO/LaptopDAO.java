package OyctechService.LaptopDAO;

// LaptopDAO.java
//package com.dao;

import OyctechService.DBConnectionManagement.DBConnectionManager;
import OyctechService.Laptop.Laptop;
import com.model.Laptop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class LaptopDAO {

    public int insertServiceList(List<Laptop> serviceList) {
        Connection connection = DBConnectionManager.getConnection();
        PreparedStatement preparedStatement = null;
        int recordsInserted = 0;

        try {
            String query = "INSERT INTO LAPTOP (HARDWARE_ID, LAPTOP_NAME, RECEIVED_DATE, ROOT_ISSUE, ISSUE_INTENSITY, BILL_AMOUNT) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(query);

            for (Laptop laptop : serviceList) {
                preparedStatement.setString(1, laptop.getHardwareId());
                preparedStatement.setString(2, laptop.getLaptopName());
                preparedStatement.setDate(3, new java.sql.Date(laptop.getReceivedDate().getTime()));
                preparedStatement.setString(4, laptop.getRootIssue());
                preparedStatement.setString(5, laptop.getIssueIntensity());
                preparedStatement.setDouble(6, laptop.getBillAmount());

                preparedStatement.addBatch();
            }

            int[] result = preparedStatement.executeBatch();
            for (int i : result) {
                recordsInserted += i;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return recordsInserted;
    }
}

