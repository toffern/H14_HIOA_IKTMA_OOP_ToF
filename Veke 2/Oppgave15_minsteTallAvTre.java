import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave15_minsteTallAvTre
{
    public static void main( String args[] )
    {
       String førsteSifferstreng, andreSifferstreng, tredjeSifferstreng, resultat; // tekststrenger

       int førstetall = Integer.parseInt( JOptionPane.showInputDialog( "Skriv første heltall:" ) );
       int andretall = Integer.parseInt( JOptionPane.showInputDialog( "Skriv andre heltall:" ) );
       int tredjetall = Integer.parseInt( JOptionPane.showInputDialog( "Skriv tredje heltall:" ) );

       // initialiserer utskriftsstrengen til at første tall er minst (i tilfelle det stemmer)
       resultat = førstetall+" er minst";

		if ( (andretall<førstetall) && (andretall<tredjetall)  )
          resultat = andretall + " er minst";
        if ( (tredjetall<førstetall) && (tredjetall<andretall)  )
          resultat = tredjetall + " er minst";

       // Viser resultat av sammenlikningene
       JOptionPane.showMessageDialog( null, resultat, "Minste tal av 3",
          JOptionPane.INFORMATION_MESSAGE );
    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave13_minstetal)