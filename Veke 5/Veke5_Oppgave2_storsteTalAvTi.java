/* OPPGAVETEKST:
Lag et program som leser inn 10 heltallsverdier fra brukeren og
skriver ut (i en dialogboks) den st�rste verdien som ble lest inn.   */


import javax.swing.JOptionPane;
import java.text.DecimalFormat; // For � styre antal desimalar p� double-verdiar


public class Veke5_Oppgave2_storsteTalAvTi
{
    public static void main( String args[] )
    {
		int inputTalet,storsteTal = 0;
		String inputTaletTXT="";
			// utgangspkt ; sjekk ; inkrement (f� slutt p� l�kka)
		for ( int i = 1; i <= 10; i += 1 ){

			inputTaletTXT = JOptionPane.showInputDialog("Gi meg et tal");

			if(inputTaletTXT!=null){
				inputTalet = Integer.parseInt(inputTaletTXT);
			}else break;

			// inputTalet = Integer.parseInt(inputTaletTXT);

			if(inputTalet>storsteTal) storsteTal=inputTalet;

		}
		// En sjekk p� om det er tasta inn tal st�rre enn null ( negative tal bryr vi oss ikkje om idag).
		if(storsteTal>0) JOptionPane.showMessageDialog( null, "St�rste tal du oppgav, var:"+storsteTal );
		else JOptionPane.showMessageDialog( null, "Takk for ingenting, latstokk" );
    } // slutt p� main-metoden
 } // slutt p� klassen Sammenlikning (oppgave13_minstetal)