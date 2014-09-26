/* OPPGAVETEKST:
Skriv et program som beregner og skriver ut andre og tredje potens av de hele tallene fra 0 til 10,
sammen med tallene selv, slik at du får en tabell tilsvarende det som er vist i dialogboksen nedenfor. */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.NumberFormat;


public class Veke5_Oppgave5_tabellMedPotensTal
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		Integer fra=0 , til=10;
		// lag tekstområdet for tabellen
		JTextArea tabellen = new JTextArea();
		// Først litt overskrifter
		tabellen.setText("Grunntal\t Andre potens\t Tredje potens\n");
		// Så loop som set inn tala.
		for ( int i=fra; i<=til; i+=1){
			tabellen.append(i+"\t");
			tabellen.append( (int)Math.pow( i,2 ) + "\t" ); //Type-casta for å gjere returverdien her om til int.
			tabellen.append( (int)Math.pow( i,3 ) + "\n" ); // Ditto...
		}
		// Til slutt, skriv ut tabellen i ei dialogboks.
		JOptionPane.showMessageDialog( null, tabellen);
	} // slutt på main-metoden

} // slutt på klasse