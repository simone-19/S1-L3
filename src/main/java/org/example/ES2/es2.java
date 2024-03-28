package org.example.ES2;

public class es2 {

    public static void main(String[] args) {
        sim sim1 = new sim("+39 3494278804");
        sim1.aggiungiCredito(20);

        chiamata[] listaChiamate = new chiamata[5];
        listaChiamate[0] = new chiamata("+39 3494278805", 20);
        listaChiamate[1] = new chiamata("+39 3494278805", 1);
        listaChiamate[2] = new chiamata("+39 3494275405", 7);
        listaChiamate[3] = new chiamata("+39 3494278876", 1);
        listaChiamate[4] = new chiamata("+39 3494272358", 13);
        sim1.setListaChiamate(listaChiamate);
        sim1.stampaDati();

    }

}
