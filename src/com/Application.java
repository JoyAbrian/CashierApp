package com;

import java.sql.SQLException;
import java.util.Scanner;
import com.CRUD.createDB;
import com.CRUD.deleteDB;
import com.CRUD.readDB;
import com.CRUD.updateDB;

public class Application {
    public static void startApp() throws SQLException {
        boolean isJalan = true;
        Scanner inputan = new Scanner(System.in);
        
        while (isJalan) {
            System.out.println("=================================================");
            System.out.println("WELCOME TO PEKALONGAN CENTER");
            System.out.println("=================================================");
            System.out.println("1.] Read Data\n2.] Insert Data\n3.] Edit Data\n4.] Delete Data");
            System.out.println("=================================================");
            System.out.print("Pilih: ");

            switch (inputan.nextInt()) {
                case 1:
                    System.out.println("=================================================");
                    readDB.readDatabase();
                    break;
                case 2:
                    System.out.println("=================================================");
                    createDB.createDatabase();
                    break;
                case 3:
                    System.out.println("=================================================");
                    updateDB.updateDatabase();
                    break;
                case 4:
                    System.out.println("=================================================");
                    deleteDB.deleteDatabase();
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    isJalan = false;
                    break;
            }
        }
        inputan.close();
    }
}