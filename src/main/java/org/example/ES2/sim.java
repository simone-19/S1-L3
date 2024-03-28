package org.example.ES2;

public class sim {
    public String numero;
    private double credito;
    private chiamata[] listaChiamate;

    public sim(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.listaChiamate = new chiamata[5];
    }

    public void aggiungiCredito(double nuovoCredito) {
        this.credito += nuovoCredito;
    }

    public void setListaChiamate(chiamata[] listaChiamate) {
        this.listaChiamate = listaChiamate;
    }

    public void stampaDati() {
        System.out.println("Sim: " + this.numero);
        System.out.println("Credito disponibile: " + this.credito);
//		System.out.println("Lista chiamate Sim: " + Arrays.toString(listaChiamate));
        if (listaChiamate[0] != null) {
            System.out.println("- Chiamata 1: " + listaChiamate[0].getNumeroChiamato() + " - Durata minuti: "
                    + listaChiamate[0].getDurata());
        }
        if (listaChiamate[1] != null) {
            System.out.println("- Chiamata 2: " + listaChiamate[1].getNumeroChiamato() + " - Durata minuti: "
                    + listaChiamate[1].getDurata());
        }
        if (listaChiamate[2] != null) {
            System.out.println("- Chiamata 3: " + listaChiamate[2].getNumeroChiamato() + " - Durata minuti: "
                    + listaChiamate[2].getDurata());
        }
        if (listaChiamate[3] != null) {
            System.out.println("- Chiamata 4: " + listaChiamate[3].getNumeroChiamato() + " - Durata minuti: "
                    + listaChiamate[3].getDurata());
        }
        if (listaChiamate[4] != null) {
            System.out.println("- Chiamata 5: " + listaChiamate[4].getNumeroChiamato() + " - Durata minuti: "
                    + listaChiamate[4].getDurata());
        }
    }

}