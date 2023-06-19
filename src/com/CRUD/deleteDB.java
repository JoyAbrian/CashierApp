package com.CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.config.Connector;

public class deleteDB {
    private static Connection connect;
    private static Statement statement;

    public static void deleteDatabase() throws SQLException {
        connect = Connector.connection();
        try {
            readDB.readDatabase();
            Scanner input = new Scanner(System.in);
            System.out.print("Pilih data yang ingin dihapus: ");
            int pilihan = input.nextInt();

            statement = connect.createStatement();
            String sql = "DELETE FROM tb_produk WHERE ID = " + pilihan;
            statement.executeUpdate(sql);
            // input.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
