public class Biblioteca {
    // ATTRIBUTI
   private long ISBN;
   private  String titolo;
   private int annoPubblicazione;
   private int numeroPagine;

 // COSTRUTTORE


    public Biblioteca(long ISBN, String titolo, int annoPubblicazione, int numeroPagine){
        this.ISBN=ISBN;
        this.titolo=titolo;
        this.annoPubblicazione=annoPubblicazione;
        this.numeroPagine=numeroPagine;

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

    @Override
    public String toString() {
        return "Biblioteca{" +
                "ISBN=" + ISBN +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
