package com.models;

public class Produk {
    private int id;
    private String name;
    private int harga;
    private int stok;

    public Produk(int id, String name, int harga, int stok) {
        this.id = id;
        this.name = name;
        this.harga = harga;
        this.stok = stok;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getStok() {
        return stok;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }


}