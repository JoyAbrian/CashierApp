package com.CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.config.Connector;

public class createDB {
    private static Connection connect;
    private static Statement statement;

    public static void createDatabase(String namaBaru, int hargaBaru, int jumlahBaru) throws SQLException {
        connect = Connector.connection();

        try {
            statement = connect.createStatement();
            statement.executeUpdate("INSERT INTO `tb_produk` (`ID`, `NAMA`, `HARGA`, `JUMLAH`) VALUES (NULL, '"+namaBaru+"', '"+hargaBaru+"', '"+jumlahBaru+"')");
            // input.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
