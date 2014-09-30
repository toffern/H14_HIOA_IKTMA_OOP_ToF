/* OPPGAVETEKST:
	http://www.iu.hio.no/~kjetilg/uvstoff/intro/kap5.html#oppg5
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Veke5_Oppgave5b_potensDriver {

    public static void main( String args[] ) {
		// lag potens-objekt
		Veke5_Oppgave5b_Potenstabell ptObjektet = new Veke5_Oppgave5b_Potenstabell();
		// Av ein eller annan grunn må eg køyre konstruktøren, eg overser noko elementært her...:
		ptObjektet.Veke5_Oppgave5b_Potenstabell();
		// Til slutt, skriv ut tabellen i ei dialogboks.
		JOptionPane.showMessageDialog( null, ptObjektet.getTabellen() );
	} // slutt på main-metoden

} // slutt på klasse