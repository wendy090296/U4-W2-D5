import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        //---------------CREAZIONE  LIBRI------------------

        Libri libro1 = new Libri(884403145, "I Malavoglia", 1881, 320, "Luigi Pirandello", "romanzo");
        Libri libro2 = new Libri(978883843, "I Promessi Sposi", 1941, 743, "Alessandro Manzoni", "romanzo storico");
        Libri libro3 = new Libri(978178166, "Dr. Jekyll and Mr.Hyde", 1948, 128, "Robert Louis Stevenson", "fantasy");
        Libri libro4 = new Libri(384459253, "Il Barone Rampante", 1957, 312, "Italo Calvino", "narrativa");
        Libri libro5 = new Libri(1226644890, "Guerra e Pace", 1869, 1415, "Lev Nikolaevic Tolstoj", "romanzo storico");
        Libri libro6 = new Libri(705558812, "Cent'anni di solitudine", 1967, 384, "Gabriel Garcia Marquez", "narrativa epica");
        Libri libro7 = new Libri(1007053123, "Orgoglio e Pregiudizio", 1813, 432, "Jane Austen", "romanzo rosa");
        Libri libro8 = new Libri(346709113, "1984", 1949, 320, "George Orwell", "romanzo distopico");
        Libri libro9 = new Libri(276568800, "Cime tempestose", 1847, 379, "Emily Brontë", "tragedia");
        Libri libro10 = new Libri(412133765, "Anna Karenina", 1877, 697, "Lev Tolstoj", "nromanzo realista");


        //------------------CREAZIONE RIVISTE----------------------

        Riviste rivista1 = new Riviste(426589016, "Internazionale", 1993, 67, Periodicità.SETTIMANALE);
        Riviste rivista2 = new Riviste(900102331, "Focus", 1992, 100, Periodicità.MENSILE);
        Riviste rivista3 = new Riviste(786002054, "Donna Moderna", 1988, 87, Periodicità.SETTIMANALE);
        Riviste rivista4 = new Riviste(673111790, "Undici", 2000, 40, Periodicità.SETTIMANALE);
        Riviste rivista5 = new Riviste(369088121, "La settimana enigmistica", 1932, 99, Periodicità.SETTIMANALE);
        Riviste rivista6 = new Riviste(876543211, "Giallo Zafferano", 2006, 50, Periodicità.SEMESTRALE);
        Riviste rivista7 = new Riviste(426589016, "Ciak Magazine", 2001, 60, Periodicità.MENSILE);
        Riviste rivista8 = new Riviste(426589016, "Rivista studio", 2006, 58, Periodicità.MENSILE);
        Riviste rivista9 = new Riviste(426589016, "Vogue", 1892, 160, Periodicità.SETTIMANALE);
        Riviste rivista10 = new Riviste(426589016, "Next look trend", 2002, 120, Periodicità.SETTIMANALE);

        // ARCHIVIO BIBLIOGRAFICO

        List<Biblioteca> archivioElementi = new ArrayList<>();

        archivioElementi.add(libro1);
        archivioElementi.add(libro2);
        archivioElementi.add(libro3);
        archivioElementi.add(libro4);
        archivioElementi.add(libro5);
        archivioElementi.add(libro6);
        archivioElementi.add(libro7);
        archivioElementi.add(libro8);
        archivioElementi.add(libro9);
        archivioElementi.add(libro10);
        archivioElementi.add(rivista1);
        archivioElementi.add(rivista2);
        archivioElementi.add(rivista3);
        archivioElementi.add(rivista5);
        archivioElementi.add(rivista6);
        archivioElementi.add(rivista7);
        archivioElementi.add(rivista8);
        archivioElementi.add(rivista9);
        archivioElementi.add(rivista10);


        //ESERCIZIO 1: AGGIUNGTA DI UN NUOVO  ELEMENTO  ALL'ARCHIVIO

        System.out.println("Ciao, scegli una delle seguenti opzioni per l'aggiunta di un nuovo elemento in archivio: " +
                "1 " + "per aggiungere UN LIBRO e " + "" +
                "2 " + "per aggiungere una RIVISTA");
        Scanner scanner = new Scanner(System.in);
        String risposta = scanner.nextLine();

        //  -AGGIUNTA LIBRO

        if (risposta.equals("1")) {
            try {
                System.out.println("PERFETTO! Ora inserisci i seguenti dettagli per aggiungere un nuovo libro:");

                System.out.print("ISBN: ");
                long ISBN = scanner.nextLong();
                scanner.nextLine();

                System.out.print("Titolo: ");
                String titolo = scanner.nextLine();

                System.out.print("Anno di pubblicazione: ");
                int annoPubblicazione = scanner.nextInt();

                System.out.print("Numero di pagine: ");
                int numeroPagine = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Autore: ");
                String autore = scanner.nextLine();

                System.out.print("Genere: ");
                String genere = scanner.nextLine();

                Libri libroAggiunto = new Libri(ISBN, titolo, annoPubblicazione, numeroPagine, autore, genere);
                System.out.println(libroAggiunto);
                System.out.println("CONFERMI CHE IL LIBRO ABBIA TUTTI I DETTAGLI? Y/N");
                String yesOrNot = scanner.nextLine();
                archivioElementi.add(libroAggiunto);
                System.out.println("GRAZIE. ECCO L'ARCHIVIO AGGIORNATO!");
                archivioElementi.forEach(System.out::println);
            } catch (InputMismatchException e) {
                System.out.println("FORMATO INCORRETTO! " + e.getMessage());
            }
            // -AGGIUNTA RIVISTA

        } else if (risposta.equals("2")) {
            try {
                System.out.println("Inserisci i seguenti dettagli per aggiungere una nuova  rivista:");

                System.out.print("ISBN: ");
                long ISBN = scanner.nextLong();
                scanner.nextLine();

                System.out.print("Titolo: ");
                String titolo = scanner.nextLine();

                System.out.print("Anno di pubblicazione: ");
                int annoPubblicazione = scanner.nextInt();

                System.out.print("Numero di pagine: ");
                int numeroPagine = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Tipo rivista (SETTIMANALE, MENSILE, SEMESTRALE): ");
                String tipoRivista = scanner.nextLine();
                Periodicità periodicità = Periodicità.valueOf(tipoRivista.toUpperCase());

                Riviste rivistaAggiunta = new Riviste(ISBN, titolo, annoPubblicazione, (int) numeroPagine, periodicità);
                System.out.println(rivistaAggiunta);
                System.out.println("CONFERMI CHE LA RIVISTA ABBIA TUTTI I DETTAGLI? Y/N");
                String yesOrNot = scanner.nextLine();
                archivioElementi.add(rivistaAggiunta);
                System.out.println("GRAZIE. ECCO L'ARCHIVIO AGGIORNATO!");
                archivioElementi.forEach(System.out::println);
            } catch (InputMismatchException e) {
                System.out.println("FORMATO INCORRETTO " + e.getMessage());
            }
        } else {
            System.out.println(risposta + "NON É UNA VALIDA OPZIONE");
        }


        scanner.close();

        rimozioneArticoloPerISBN(archivioElementi,426589016);
        ricercaPerISBN(archivioElementi,426589016);
        ricercaPerAutore(archivioElementi,"Luigi Pirandello");
        annoPubblicazione(archivioElementi,1877);


    }





// 2) RIMOZIONE ARTICOLO CON IBSN

    public static void rimozioneArticoloPerISBN ( List<Biblioteca> archivioElementi ,long ISBN){
        archivioElementi = archivioElementi.stream()
                .filter(articolo -> articolo.getISBN() != ISBN)
                .collect(Collectors.toList());
    }

    // 3) RICERCA ARTICOLO PER IBSN

    public static Map<Long, String> ricercaPerISBN (List<Biblioteca> archivioElementi, long ISBN){
        return archivioElementi.stream()
                .filter(articolo -> articolo instanceof Libri)
                .filter(articolo -> articolo.getISBN() == ISBN)
                .collect(Collectors.toMap(Biblioteca::getISBN, Biblioteca::getTitolo));
    }

    // 4) RICERCA ARTICOLO PER ANNO PUBBLICAZIONE

    public static void annoPubblicazione (List<Biblioteca> archivioElementi, int annoDiPubblicazione){
        archivioElementi = archivioElementi.stream()
                .filter(articolo -> articolo.getAnnoPubblicazione() == annoDiPubblicazione)
                .collect(Collectors.toList());
    }

    //5) RICERCA PER AUTORE

    public static void ricercaPerAutore (List<Biblioteca> archivioElementi,String autore){
        archivioElementi.stream()
                .filter(articolo -> articolo instanceof Libri)
                .map(elemento -> (Libri) elemento)
                .filter(libro -> libro.getAutore().equals(autore))
                .forEach(System.out::println);
    }
}



