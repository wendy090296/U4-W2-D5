package entities;

public class Biblioteca {
    // ATTRIBUTI
   protected long ISBN;
   protected  String titolo;
   protected int annoPubblicazione;
   protected int numeroPagine;


 // COSTRUTTORE


    public Biblioteca(long ISBN, String titolo, int annoPubblicazione, int numeroPagine){
        this.ISBN=ISBN;
        this.titolo=titolo;
        this.annoPubblicazione=annoPubblicazione;
        this.numeroPagine=numeroPagine;
//        this.autore=autore;

    }

// GETTERS E SETTERS


    public long getISBN() {
        return ISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }
//public String getAutore (){
//        return getAutore;
//
//}
    @Override
    public String toString() {
        return "entities.Biblioteca{" +
                "ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
