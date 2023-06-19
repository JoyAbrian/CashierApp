package com.CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.config.Connector;

public class createDB {
    private static Connection connect;
    private static Statement statement;

    public static void createDatabase() throws SQLException {
        connect = Connector.connection();
        Scanner input = new Scanner(System.in);

        System.out.print("Nama  : ");
        String namaBaru = input.nextLine();
        System.out.print("Harga : ");
        int hargaBaru = input.nextInt();
        System.out.print("Jumlah : ");
        int jumlahBaru = input.nextInt();

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
