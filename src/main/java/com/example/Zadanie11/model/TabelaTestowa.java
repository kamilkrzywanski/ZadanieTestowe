package com.example.Zadanie11.model;

import javax.persistence.*;

//Automatyczne utworzenie tabeli w bazie danych
@Entity
@Table(name = "tabela_testowa")
public class TabelaTestowa {
    @Id
    @Column(name = "id", nullable=false)
    private long id;

    @Column(name = "kolumna1", length=256)
    private String kolumna1;

    @Column(name = "kolumna2", length=256)
    private String kolumna2;

    @Column(name = "kolumna3", length=256)
    private String kolumna3;

    @Column(name = "kolumna4")
    private long kolumna4;

    public long getId() {
        return id;
    }

    public String getKolumna1() {
        return kolumna1;
    }

    public String getKolumna2() {
        return kolumna2;
    }

    public String getKolumna3() {
        return kolumna3;
    }

    public long getKolumna4() {
        return kolumna4;
    }
}
