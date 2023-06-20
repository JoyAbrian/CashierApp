package com.CRUD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.models.Produk;
import com.config.Connector;
import java.util.ArrayList;

public class readDB {
    private static Connection connect;
    private static Statement statement;
    private static ResultSet resultSet;

    public static ArrayList<Produk> readDatabase() throws SQLException {
        connect = Connector.connection();
        
        ArrayList<Produk> list_prod = new ArrayList<>();
        try {
            String query = "SELECT ID, NAMA, HARGA, JUMLAH FROM `tb_produk`"; 
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            
            while(resultSet.next()) {
                list_prod.add(new Produk(resultSet.getInt("ID"), resultSet.getString("NAMA"), resultSet.getInt("HARGA"), resultSet.getInt("JUMLAH")));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list_prod;
    }
}
