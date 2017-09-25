package com.arief.spring.entity;

import javax.persistence.*;

@Entity
@Table(name="t_user")
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue
    private int id;


    @Column(name="nama")
    private String nama;

    @Column(name="alamat")
    private String alamat;

    public User() {
    }

    public User(String nama ,String alamat){
        this.nama=nama;
        this.alamat=alamat;
    }

    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getAlamat(){
        return alamat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
