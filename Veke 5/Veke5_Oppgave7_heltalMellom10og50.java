/* OPPGAVETEKST:
Lag et program som leser inn hele tall fra brukeren inntil det blir lest inn et negativt tall.
Programmet skal telle opp hvor mange av de innleste tallene som er mellom 10 og 50
(ingen av grensene inkludert) og skrive ut dette antallet.
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.NumberFormat;


public class Veke5_Oppgave7_heltalMellom10og50
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		Integer nedreGrense=10 , ovreGrense=50;
		Integer inputTal, antalMellomGrensene=0;

		// Lag textarea til å skriv ut innhald på.
		JTextArea tabellen = new JTextArea();
		tabellen.setText("Antal tal mellom "+nedreGrense+" og "+ovreGrense+": \n");

		inputTal = heiltalInput("Hit me baby, one more tal");

		while(inputTal>0){
			if(inputTal>nedreGrense && inputTal<ovreGrense)
			antalMellomGrensene++;

			inputTal = heiltalInput("One more tal?");
		}

		String antalMellomGrenseneTxt = Integer.toString(antalMellomGrensene);
		tabellen.append( antalMellomGrenseneTxt + "\n");

		// Print it mæn.
		JOptionPane.showMessageDialog( null, tabellen);
	} // slutt på main-metoden

	public static int heiltalInput(String s){
		Integer inputTalet=null;
		// Try-Catch-en gir feilmelding dersom nokon ikkje skriv inn tal, men stoppar ikkje main frå å krasje. Må finne ut korleis ein skal "lande kontrollert".
		try{ inputTalet = Integer.parseInt(JOptionPane.showInputDialog(s));
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog( null, "Det var vel eit tal eg spurte om?" );
		}finally{  // Litt usikker på kva denne finally-gjer.
			return inputTalet;
		}
	} // slutt på heiltalInput-metoda

} // slutt på klasse