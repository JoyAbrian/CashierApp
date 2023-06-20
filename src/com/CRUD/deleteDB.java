package com.CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.config.Connector;

public class deleteDB {
    private static Connection connect;
    private static Statement statement;

    public static void deleteDatabase(int id) throws SQLException {
        connect = Connector.connection();
        try {
            statement = connect.createStatement();
            String sql = "DELETE FROM tb_produk WHERE ID = " + id;
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
