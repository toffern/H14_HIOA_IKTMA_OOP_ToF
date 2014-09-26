/* OPPGAVETEKST:
Lag et program som beregner og skriver ut (i en dialogboks) summen
  2 + 4 + 6 + 8 + ... + 98    */

import javax.swing.JOptionPane;
import java.text.DecimalFormat; // For å styre antal desimalar på double-verdiar


public class Veke5_Oppgave2_storsteTalAvTi
{
    public static void main( String args[] )
    {
		Integer inputTalet,storsteTal = 0;
		String inputTaletTXT="";
		for ( int i = 1; i <= 10; i += 1 ){
			inputTaletTXT = JOptionPane.showInputDialog("Gi meg et tal");
			if(inputTaletTXT!=null){
				inputTalet = Integer.parseInt(inputTaletTXT);
			}else break;
			if(inputTalet>storsteTal) storsteTal=inputTalet;
		}
		// En sjekk på om det er tasta inn tal større enn null ( negative tal bryr vi oss ikkje om idag).
		if(storsteTal>0) JOptionPane.showMessageDialog( null, "Største tal du oppgav, var:"+storsteTal );
		else JOptionPane.showMessageDialog( null, "Takk for ingenting, latstokk" );
    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave13_minstetal)