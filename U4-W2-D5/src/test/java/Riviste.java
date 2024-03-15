public class Riviste extends Biblioteca {
    private Periodicità periodicità;

    public Riviste(long ISBN, String titolo, int annoPubblicazione, int numeroPagine, Periodicità periodicità) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        this.periodicità=periodicità;

    }
}
