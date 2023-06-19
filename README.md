### FOLDER com
Terdapat 2 folder dan 1 class, penjelasannya sebagai berikut.

## FOLDER config
Dalam folder ini terdapat 1 class Connector.java

# Connector.java
Class ini memiliki method connection() yang berfungsi untuk mereturn Connection untuk mereturn DriverManager.connection dengan parameter URL, USER, dan PASS database

## FOLDER CRUT
Folder ini terisi 4 class untuk merepresentasikan 4 fungsi basic database yaitu create, read, update, dan delete

# createDB.java
Class ini memiliki method createDatabase() yang berfungsi menampilkan menu tambah data yang akan meminta user menginput nama, harga, dan stok produk. Dan setelah semua inputan sudah, program akan menambahkan stock baru ke database.

# readDB.java
Class ini memiliki method readDatabase() yang berfungsi menampilkan semua data dalam database.

# updateDB.java
Class ini memiliki method updateDatabase() yang berfungsi menampilkan menu update data yang akan meminta user menginput pilihan 1-3, dimana 1 untuk mengubah nama, 2 untuk mengubah harga, dan 3 untuk mengubah stok. Setelah dipilih, program akan meminta untuk menginput ID data yang akan diubah, setelah itu program akan meminta untuk menginput nilai baru untuk mengubah data dalam database.

# deleteDB.java
Class ini memiliki method deleteDatabase() yang berfungsi menampilkan menu hapus data yang akan meminta user untuk menginput pilihan data yang ingin dihapus. Setelah menginput, program akan menghapus data yang dipilih dari database.

## Application.java
Class ini memiliki method startApp() yang berfungsi menampilkan menu utama dari aplikasi serta memberikan inputan untuk menginput pilihan.

### Main.java
Class ini akan berfungsi untuk menjalankan method startApp() dari class Application.java