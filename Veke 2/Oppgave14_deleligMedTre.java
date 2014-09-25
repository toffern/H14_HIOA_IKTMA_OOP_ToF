import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave14_deleligMedTre
{
    public static void main( String args[] )
    {
       String førsteSifferstreng;   // brukes ved innlesing
       String resultat;        // tekststreng som brukes til utskrift

       int førstetall;          // første tall som skal sammenliknes
       førsteSifferstreng = JOptionPane.showInputDialog( "Skriv første heltall:" );

       // konverterer sifferstrenger til heltallsverdier
       førstetall = Integer.parseInt( førsteSifferstreng );

       // initialiserer utskriftsstrengen til en tom streng
       resultat = "";

		if ( (førstetall%3)==0 )  resultat = førstetall + " er delelig med 3";
		else resultat = førstetall + " er IKKJE delelig med 3";
       // Viser resultat av sammenlikningene
       JOptionPane.showMessageDialog( null, resultat, "Sammenlikningsresultater",
          JOptionPane.INFORMATION_MESSAGE );
    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave13_minstetal)