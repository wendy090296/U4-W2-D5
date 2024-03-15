import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        //---------------LISTA DI LIBRI------------------
        Libri libro1= new Libri(884403145,"I Malavoglia",1881,320,"Luigi Pirandello","romanzo");
        Libri libro2= new Libri(978883843,"I Promessi Sposi",1941,743,"Alessandro Manzoni","romanzo storico");
        Libri libro3= new Libri(978178166,"Dr. Jekyll and Mr.Hyde",1948,128,"Robert Louis Stevenson","fantasy");
        Libri libro4= new Libri(384459253,"Il Barone Rampante",1957,312,"Italo Calvino","narrativa");
        Libri libro5= new Libri(1226644890,"Guerra e Pace",1869,1415,"Lev Nikolaevic Tolstoj","romanzo storico");
        Libri libro6= new Libri(705558812,"Cent'anni di solitudine",1967,384,"Gabriel Garcia Marquez","narrativa epica");
        Libri libro7= new Libri(1007053123,"Orgoglio e Pregiudizio",1813,432,"Jane Austen","romanzo rosa");
        Libri libro8= new Libri(346709113,"1984",1949,320,"George Orwell","romanzo distopico");
        Libri libro9= new Libri(276568800,"Cime tempestose",1847,379,"Emily Brontë","tragedia");
        Libri libro10= new Libri(412133765,"Anna Karenina",1877,697,"Lev Tolstoj","nromanzo realista");

        // aggiunta dei libri in una lista

        List<Libri> listaLibri= new ArrayList<>();
        listaLibri.add(libro1);
        listaLibri.add(libro2);
        listaLibri.add(libro3);
        listaLibri.add(libro4);
        listaLibri.add(libro5);
        listaLibri.add(libro6);
        listaLibri.add(libro7);
        listaLibri.add(libro8);
        listaLibri.add(libro9);
        listaLibri.add(libro10);

        //------------------CREAZIONE RIVISTE----------------------

        Riviste rivista1= new Riviste(426589016,"Internazionale",1993,67,Periodicità.SETTIMANALE);
        Riviste rivista2= new Riviste(900102331,"Focus",1992,100,Periodicità.MENSILE);
        Riviste rivista3= new Riviste(786002054,"Donna Moderna",1988,87,Periodicità.SETTIMANALE);
        Riviste rivista4= new Riviste(673111790,"Undici",2000,40,Periodicità.SETTIMANALE);
        Riviste rivista5= new Riviste(369088121,"La settimana enigmistica",1932,99,Periodicità.SETTIMANALE);
        Riviste rivista6= new Riviste(876543211,"Giallo Zafferano",2006,50,Periodicità.SEMESTRALE);
        Riviste rivista7= new Riviste(426589016,"Ciak Magazine",2001,60,Periodicità.MENSILE);
        Riviste rivista8= new Riviste(426589016,"Rivista studio",2006,58,Periodicità.MENSILE);
        Riviste rivista9= new Riviste(426589016,"Vogue",1892,160,Periodicità.SETTIMANALE);
        Riviste rivista10= new Riviste(426589016,"Next look trend",2002,120,Periodicità.SETTIMANALE);

        List<Riviste> listaRiviste= new ArrayList<>();
        System.out.println(libro1);



    }
}
