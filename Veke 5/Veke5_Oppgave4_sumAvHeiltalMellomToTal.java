/* OPPGAVETEKST:
Lag et program som beregner og skriver ut summen av alle hele tall mellom to grenser som brukeren skriver inn.
Programmet skal starte med å lese inn nedre og øvre grense for summen.
Dersom innlest øvre grense er mindre enn eller lik nedre grense, skal programmet skrive ut en melding til brukeren om dette og deretter avslutte.
Ellers skal programmet beregne nevnte sum - nedre grense skal tas med i summen, men ikke øvre grense - og summen skal skrives ut.   */

import javax.swing.JOptionPane;


public class Veke5_Oppgave4_sumAvHeiltalMellomToTal
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		Integer inputMax=0,inputMin=0, sum=0;
		String inputTaletTXT="",melding="", reknestykket="";
		inputMin = heiltalInput("Gi meg eit heiltal, som skal vere nedre grense");
		inputMax = heiltalInput("Gi meg eit heiltal, som skal vere øvre grense");

		for ( int i=inputMin; i<inputMax; i+=1){
			sum+=i;
			if(i>inputMin) reknestykket +="+"; //Sleng på teksten "+", men ikkje i første runda.
			reknestykket += i;
		}

		JOptionPane.showMessageDialog( null, "Summen blir: "+sum+"\n Reknestykket blir: "+reknestykket );
	} // slutt på main-metoden

	// På tide å lage sin eigen metode, inspirert etter dagens oppgaveøkt.
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