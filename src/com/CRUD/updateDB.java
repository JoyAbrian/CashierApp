package com.CRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.config.Connector;

public class updateDB {
    private static Connection connect;
    private static Statement statement;

    public static void updateDatabase() throws SQLException {
        connect = Connector.connection();
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Pilih data yang ingin diubah");
            System.out.println("1. Nama Barang\n2. Harga Barang\n3. Jumlah Stok Barang");

            System.out.print("Pilih: ");
            int pilihan = input.nextInt();
            System.out.println("=================================================");
            readDB.readDatabase();
            System.out.println("=================================================");
            System.out.print("Pilih data yang ingin diedit: ");
            int pilihan2 = input.nextInt();
            String sql = "";
            statement = connect.createStatement();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Baru: ");
                    String namaBaru = input.next();

                    sql = "UPDATE tb_produk SET `NAMA` = '" + namaBaru + "' WHERE ID = " + pilihan2;
                    statement.executeUpdate(sql);
                    break;
                case 2:
                    System.out.print("Harga Baru: ");
                    int hargaBaru = input.nextInt();

                    sql = "UPDATE tb_produk SET `HARGA` = '" + hargaBaru + "' WHERE ID = " + pilihan2;
                    statement.executeUpdate(sql);
                    break;
                case 3:
                    System.out.print("Stock Baru: ");
                    int stokBaru = input.nextInt();

                    sql = "UPDATE tb_produk SET `JUMLAH` = '" + stokBaru + "' WHERE ID = " + pilihan2;
                    statement.executeUpdate(sql);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");;
            }
            System.out.println("Berhasil diupdate");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
