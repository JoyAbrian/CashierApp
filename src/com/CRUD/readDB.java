package com.CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.config.Connector;

public class readDB {
    private static Connection connect;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void readDatabase() throws SQLException {
        connect = Connector.connection();
        try {
            String query = "SELECT * FROM `tb_produk`"; 
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            
            while(resultSet.next()) {
                System.out.println(
                    resultSet.getString("ID") + ". " +
                    resultSet.getString("NAMA") + 
                    " - Rp." + resultSet.getString("HARGA") + 
                    " - Stock:" + resultSet.getString("JUMLAH")
                    );
                }
                statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
