package com.platinum;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

public class DatabaseConnectionTest {
    @Test
    public void testConnection() {
        try {
            Connection connection = DatabaseConnection.getConnection();
            assertNotNull(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}