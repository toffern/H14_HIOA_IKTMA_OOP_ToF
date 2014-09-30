/* OPPGAVETEKST:
Lag en utvidet versjon av programmet fra oppgave 7. I tillegg til det tidligere skal programmet nå
beregne gjennomsnittsverdien for de innleste tallene mellom de nevnte grensene.
Skriv gjennomsnittet som desimaltall [..] med to desimaler, samt hvor mange av de innleste tallene
som var mellom de nevnte grensene. Divisjon med 0 skal unng?s! Dersom ingen av de innleste tallene
var mellom de nevnte grensene, skal programmet skrive ut en melding om dette istedenfor det
som ellers skal skrives ut.
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.NumberFormat;


public class Veke5_Oppgave8_heltalMellom10og50_med_gjennomsnitt
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		Integer nedreGrense=10 , ovreGrense=50;
		Integer inputTal, antalMellomGrensene=0, gjennomsnitt=0,sum=0;

		// Lag textarea til å skriv ut innhald på.
		JTextArea tabellen = new JTextArea();

		inputTal = heiltalInput("Hit me baby, one more tal");

		while(inputTal>0){
			if(inputTal>nedreGrense && inputTal<ovreGrense){
				antalMellomGrensene++;
				sum += inputTal;
			}
			// Klar for ny runde
			inputTal = heiltalInput("One more tal?");
		}
		// Berekne gjennomsnitt
		if(antalMellomGrensene>0 && sum>0) gjennomsnitt = sum/antalMellomGrensene;

		// Sett overskrift, intro i tekstfeltet
		tabellen.setText("Antal tal mellom "+nedreGrense+" og "+ovreGrense+": \n");

		// Lag pen string til utskrift av antallMellomGrensene
		String antalMellomGrenseneTxt = Integer.toString(antalMellomGrensene);
		tabellen.append( antalMellomGrenseneTxt + "\n");

		// Og så legg vi til gjennomsnittet i textfield'en.
		String gjennomsnittTxt = Integer.toString(gjennomsnitt);
		tabellen.append( gjennomsnittTxt + "\n");


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