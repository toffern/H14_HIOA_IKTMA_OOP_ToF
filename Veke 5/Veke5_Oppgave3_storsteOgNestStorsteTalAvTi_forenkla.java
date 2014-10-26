/* OPPGAVETEKST:
Utvid programmet fra oppgave 2 slik at det ogs� skriver ut det nest st�rste av de tallene som ble lest inn.    */

import javax.swing.JOptionPane;


public class Veke5_Oppgave3_storsteOgNestStorsteTalAvTi_forenkla
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		int inputTalet=0,storsteTal=0 ,nestStorsteTal=0;
		String inputTaletTXT="",melding="";
		int i=1;  // M� definere denne variabelen her, fordi den blir brukt ogs� utanfor FOR-loopen (linje 34 +- ;) )

		for ( i = 1; i <= 10; i += 1 ){
			inputTaletTXT = JOptionPane.showInputDialog("Gi meg et tal");
			inputTalet = Integer.parseInt(inputTaletTXT);

			if(inputTalet>storsteTal){  // Dersom talet er st�rre enn tidligare st�rste tal, eller dette er f�rste tal.
				// N�r vi set eit nytt st�rstetall, s� m� f�rst NestSt�rste f� verdien til "det gamle" st�rstetal.
				nestStorsteTal = storsteTal; // F�rste runda i loopen, kan vi ikkje definere nest st�rste tal...
				storsteTal=inputTalet;
			}else if(inputTalet>nestStorsteTal){ //Talet kan vere st�rre enn nest-st�rste tal...
				nestStorsteTal = inputTalet;
			}
		}
		// En sjekk p� om det er tasta inn tal st�rre enn null ( negative tal bryr vi oss ikkje om idag).
		melding = "St�rste tall er: "+storsteTal+", og nest st�rste tall er: "+nestStorsteTal;
		if(storsteTal!=0) JOptionPane.showMessageDialog( null, melding );
		else JOptionPane.showMessageDialog( null, "Takk for ingenting, latstokk" );
    } // slutt p� main-metoden
 } // slutt p� klasse