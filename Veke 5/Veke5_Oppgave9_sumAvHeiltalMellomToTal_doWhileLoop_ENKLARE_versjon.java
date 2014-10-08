/* OPPGAVETEKST:
Lag et program som beregner og skriver ut summen av alle hele tall mellom to grenser som brukeren skriver inn.
Programmet skal starte med � lese inn nedre og �vre grense for summen.
Dersom innlest �vre grense er mindre enn eller lik nedre grense, skal programmet skrive ut en melding til brukeren om dette og deretter avslutte.
Ellers skal programmet beregne nevnte sum - nedre grense skal tas med i summen, men ikke �vre grense - og summen skal skrives ut.
******
I den nye versjonen skal innlesing av nedre og �vre grense foretas om igjen inntil det er lest inn en �vre grense som er minst like stor som nedre grense.
*/

import javax.swing.JOptionPane;


public class Veke5_Oppgave9_sumAvHeiltalMellomToTal_doWhileLoop_ENKLARE_versjon
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		int inputMax=0,inputMin=0, sum=0;
		String inputTaletTXT="",melding="", reknestykket="";

		inputMin = Integer.parseInt(JOptionPane.showInputDialog("Gi meg eit heiltal, som skal vere nedre grense"));
		// Her kjem forskjellen i forhold til oppg.4, vi m� loope input av �vregrense, inntil den er st�rre enn nedregrense. Litt input-kontroll her alts�.
		int inputTeller=1;
		String feilMld;
		do{
			inputMax = Integer.parseInt(JOptionPane.showInputDialog("Gi meg eit heiltal, som skal vere �vre grense"));
			inputTeller++;
			if(inputMax<=inputMin){
				feilMld = (inputTeller>2) ? "Kremt, for "+inputTeller+"de gang, �vre grense m� v�re st�rre enn mindre grense" : "Du m� velje eit st�rre tal.";
				heiltalInput(feilMld);
				inputTeller++;
			}
		}while(inputMax<=inputMin);

		for ( int i=inputMin; i<inputMax; i+=1){
			sum+=i;
			if(i>inputMin) reknestykket +="+"; //Sleng p� teksten "+", men ikkje i f�rste runda.
			reknestykket += i;
		}

		JOptionPane.showMessageDialog( null, "Summen blir: "+sum+"\n Reknestykket blir: "+reknestykket + " (husk at �vre grense sj�lv ikkje skal reknast med)");
	} // slutt p� main-metoden

	// P� tide � lage sin eigen metode, inspirert etter dagens oppgave�kt.
    public static int heiltalInput(String s){
		Integer inputTalet=null;
		// Try-Catch-en gir feilmelding dersom nokon ikkje skriv inn tal, men stoppar ikkje main fr� � krasje. M� finne ut korleis ein skal "lande kontrollert".
		try{ inputTalet = Integer.parseInt(JOptionPane.showInputDialog(s));
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog( null, "Det var vel eit tal eg spurte om?" );
		}finally{  // Litt usikker p� kva denne finally-gjer.
			return inputTalet;
		}
	} // slutt p� heiltalInput-metoda
} // slutt p� klasse