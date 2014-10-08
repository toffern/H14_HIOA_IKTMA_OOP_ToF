/* OPPGAVETEKST:
Lag et applikasjonsprogram som trekker 100 slumptall (hele tall) i intervallet fra 0 (inkludert) til 100 (ikke inkludert).
Du f�r et slikt tall ved � skrive:  int tall = (int) (Math.random() * 100);
Programmet skal skrive ut i tabellform alle tall som blir trukket, med 10 tall per linje.
Utskriften skal gj�res i et tekstomr�de som blir plassert i dialogboks.
Programmet skal ogs� finne og skrive ut det minste, det nest minste, det nest st�rste og det st�rste
av tallene som blir trukket. P� utskriften vil du kunne se om det er funnet riktige verdier
for disse tallene!
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.text.NumberFormat;


public class Veke5_Oppgave6_100tilfeldigeTal
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		Integer fra=0 , til=100;
		// Set verdiane s� h�gt (eller lavt) dei kan g�, s� loopen kan ta dei ned (eller opp)
		Integer storste=fra, nestStorste=fra+1, minste=til, nestMinste=til-1;

		JTextArea tabellen = new JTextArea();

		tabellen.setText("Tilfeldige tal: \n");

		for ( int i=fra; i<til; i+=1){
			// Legg til nylinje kvar 10de tal med modulus 10, og d� eit unntak for 0 som ogs� gir 0
			if(i%10==0 && i>0) tabellen.append("\n");
			// Finn eit tilfeldig tal, typecast det til int/heiltal
			int rnd = (int) (Math.random()*100);
			// For � skrive det ut, m� det v�re string.
			String rndTxt = Integer.toString(rnd);
			tabellen.append( rndTxt + "\t");

			// Sjekk om rnd-talet er det st�rste, nest st�rste, minste eller nest minste
			if(rnd>storste){
					nestStorste = storste;
					storste=rnd;
			}
			if(rnd>nestStorste && rnd<storste) nestStorste=rnd;
			if(rnd<minste){
				nestMinste = minste;
				minste=rnd;
			}
			if(rnd<nestMinste && rnd>minste) nestMinste=rnd;
		}
		// Legg til utskrift av tala st�rst->minst.
		tabellen.append("\n\n St�rst:\t "+storste);
		tabellen.append("\n Nest st�rst:\t "+nestStorste);
		tabellen.append("\n Nest minste:\t "+nestMinste);
		tabellen.append("\n Minste:\t "+minste);
		// Print it baby.
		JOptionPane.showMessageDialog( null, tabellen);
	} // slutt p� main-metoden

} // slutt p� klasse