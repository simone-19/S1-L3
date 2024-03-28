package org.example.ES2;

public class chiamata {
    private String numeroChiamato;
    private int durata;

    public chiamata(String numChiamato, int durata) {
        this.numeroChiamato = numChiamato;
        this.durata = durata;
    }

    public String getNumeroChiamato() {
        return this.numeroChiamato;
    }

    public int getDurata() {
        return this.durata;
    }

}
