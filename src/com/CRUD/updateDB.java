package com.CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.config.Connector;

public class updateDB {
    private static Connection connect;
    private static Statement statement;

    public static void updateDatabase(int id, String namaBaru, String hargaBaru, String stokBaru, int pilihan) throws SQLException {
        connect = Connector.connection();
        try {
            String sql = "";
            statement = connect.createStatement();

            switch (pilihan) {
                case 1:
                    sql = "UPDATE tb_produk SET `NAMA` = '" + namaBaru + "' WHERE ID = " + id;
                    statement.executeUpdate(sql);
                    break;
                case 2:
                    sql = "UPDATE tb_produk SET `HARGA` = '" + hargaBaru + "' WHERE ID = " + id;
                    statement.executeUpdate(sql);
                    break;
                case 3:
                    sql = "UPDATE tb_produk SET `JUMLAH` = '" + stokBaru + "' WHERE ID = " + id;
                    statement.executeUpdate(sql);
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
