package com.burakkutbay.springbootpagination.model;

import javax.persistence.*;

/**
 * Created by  Burak KUTBAY on 7.11.2020.
 */
@Entity
@Table
public class Sehirler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int plaka;
    private String ad;
    private int nufus;

    public Sehirler() {
    }

    public Sehirler(Long id, int plaka, String ad, int nufus) {
        this.id = id;
        this.plaka = plaka;
        this.ad = ad;
        this.nufus = nufus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPlaka() {
        return plaka;
    }

    public void setPlaka(int plaka) {
        this.plaka = plaka;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }
}
