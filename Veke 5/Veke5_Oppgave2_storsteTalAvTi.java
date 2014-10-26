/* OPPGAVETEKST:
Lag et program som leser inn 10 heltallsverdier fra brukeren og
skriver ut (i en dialogboks) den største verdien som ble lest inn.   */


import javax.swing.JOptionPane;
import java.text.DecimalFormat; // For å styre antal desimalar på double-verdiar


public class Veke5_Oppgave2_storsteTalAvTi
{
    public static void main( String args[] )
    {
		int inputTalet,storsteTal = 0;
		String inputTaletTXT="";
			// utgangspkt ; sjekk ; inkrement (få slutt på løkka)
		for ( int i = 1; i <= 10; i += 1 ){

			inputTaletTXT = JOptionPane.showInputDialog("Gi meg et tal");

			if(inputTaletTXT!=null){
				inputTalet = Integer.parseInt(inputTaletTXT);
			}else break;

			// inputTalet = Integer.parseInt(inputTaletTXT);

			if(inputTalet>storsteTal) storsteTal=inputTalet;

		}
		// En sjekk på om det er tasta inn tal større enn null ( negative tal bryr vi oss ikkje om idag).
		if(storsteTal>0) JOptionPane.showMessageDialog( null, "Største tal du oppgav, var:"+storsteTal );
		else JOptionPane.showMessageDialog( null, "Takk for ingenting, latstokk" );
    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave13_minstetal)