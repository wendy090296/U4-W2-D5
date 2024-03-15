public class Libri extends Biblioteca{
    //ATTRIBUTI
    private String autore;
    private String genere;
    public Libri(long ISBN, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(ISBN, titolo, annoPubblicazione, numeroPagine);
        this.autore=autore;
        this.genere=genere;
    }
}
