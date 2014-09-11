import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave12_ifOperatorar

    public static void main( String args[] )
    {
       String førsteSifferstreng;   // brukes ved innlesing
       String andreSifferstreng;    // brukes ved innlesing
       String resultat;        // tekststreng som brukes til utskrift

       int førstetall;          // første tall som skal sammenliknes
       int andretall;          // andre tall som skal sammenliknes

       førsteSifferstreng =
               JOptionPane.showInputDialog( "Skriv første heltall:" );
       andreSifferstreng =
          JOptionPane.showInputDialog( "Skriv andre heltall:" );

       // konverterer sifferstrenger til heltallsverdier
       førstetall = Integer.parseInt( førsteSifferstreng );
       andretall = Integer.parseInt( andreSifferstreng );

       // initialiserer utskriftsstrengen til en tom streng
       resultat = "";

       if ( førstetall == andretall )
          resultat = resultat + førstetall + " == " + andretall;

     if ( førstetall != andretall )
1          resultat = resultat + førstetall + " != " + andretall;

       if ( førstetall < andretall )
          resultat = resultat + "\n" + førstetall + " < " + andretall;

       if ( førstetall > andretall )
7          resultat = resultat + "\n" + førstetall + " > " + andretall;
8
       if ( førstetall <= andretall )
          resultat = resultat + "\n" + førstetall + " <= " + andretall;
1
       if ( førstetall >= andretall )
          resultat = resultat + "\n" + førstetall + " >= " + andretall;

       // Viser resultat av sammenlikningene
       JOptionPane.showMessageDialog( null, resultat, "Sammenlikningsresultater",
          JOptionPane.INFORMATION_MESSAGE );
    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave12_ifOperatorar)