package com.mefju.springboot.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "karnet")
public class Karnet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int ID;

    @Size(min=1, message="tekst za krotki")
    @Size(max = 45, message="tekst za dlugi")
    @Column(name = "Nazwa")
    private String Nazwa;
    @DecimalMin(value = "1",message = "Musi byc wiekszy od 1")
    @DecimalMax(value = "300",message = "Musi byc wiekszy od 1")
    @Column(name= "Cena")
    private double Cena;

    public Karnet() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNazwa() {
        return Nazwa;
    }

    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    public double getCena() {
        return Cena;
    }

    public void setCena(double cena) {
        Cena = cena;
    }
}
