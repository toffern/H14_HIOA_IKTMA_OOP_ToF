/* OPPGAVETEKST:
Lag et program som leser inn hele tall fra brukeren inntil det blir lest inn et negativt tall.
Programmet skal telle opp hvor mange av de innleste tallene som er mellom 10 og 50
(ingen av grensene inkludert) og skrive ut dette antallet.
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.NumberFormat;


public class Veke5_Oppgave7_heltalMellom10og50_ENKLARE_versjon
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		Integer nedreGrense=10 , ovreGrense=50;
		Integer inputTal, antalMellomGrensene=0;

		// Lag textarea til � skriv ut innhald p�.
		JTextArea tabellen = new JTextArea();
		tabellen.setText("Antal tal mellom "+nedreGrense+" og "+ovreGrense+": \n");

		inputTal = Integer.parseInt(JOptionPane.showInputDialog("Hit me baby, one more tal"));

		while(inputTal>0){
			if(inputTal>nedreGrense && inputTal<ovreGrense)
			antalMellomGrensene++;

			inputTal = Integer.parseInt(JOptionPane.showInputDialog("One more tal?"));

		}

		String antalMellomGrenseneTxt = Integer.toString(antalMellomGrensene);
		tabellen.append( antalMellomGrenseneTxt + "\n");

		// Print it m�n.
		JOptionPane.showMessageDialog( null, tabellen);
	} // slutt p� main-metoden


} // slutt p� klasse