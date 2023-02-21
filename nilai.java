/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugags_uas_icha;

/**
 *
 * @author ASUS
 */
public class nilai {
        private int nilaiPraktek;
    private int nilaiTeori;
    public int getNP() {
        return nilaiPraktek;
    }
    public int getNT() {
        return nilaiTeori;
    }
    public void setNilaiPraktek (int nilaiPraktek) {
        this.nilaiPraktek = nilaiPraktek;
    }
    public void setNilaiTiori (int nilaiTiori) {
        this.nilaiTeori = nilaiTeori;
    }
    public nilai() {
        int np = 0;
        int nt = 0;
    }
    public int na (int np, int nt) {
        return np+nt/2;
    }
    public int getNa() {
        return na(nilaiPraktek, nilaiTeori);
    }
}

