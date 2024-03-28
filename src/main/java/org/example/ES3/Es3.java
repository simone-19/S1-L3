package org.example.ES3;

import java.util.Date;

public class Es3 {

    public static void main(String[] args) {
        Cliente aldo = new Cliente("1234", "Aldo", "Baglio", "aldo@baglio.com", new Date());
        Articolo telefono = new Articolo("Iphone", "Super", 1000);
        telefono.aggiungiPezziAMagazzino(20);
        System.out.println(telefono);
        Articolo tv = new Articolo("Samsung", "Mediocre", 500);
        Carrello carrelloDiAldo = new Carrello(aldo);

        Articolo[] listaArticoliComprati = { telefono, tv };
        carrelloDiAldo.setElencoArticoli(listaArticoliComprati);
        System.out.println(carrelloDiAldo.getTotaleCostoArticoli());
    }

}
