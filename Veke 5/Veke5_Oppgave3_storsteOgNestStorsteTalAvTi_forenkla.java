/* OPPGAVETEKST:
Utvid programmet fra oppgave 2 slik at det også skriver ut det nest største av de tallene som ble lest inn.    */

import javax.swing.JOptionPane;


public class Veke5_Oppgave3_storsteOgNestStorsteTalAvTi_forenkla
{
    public static void main( String args[] )
    {
		// Definer variablane for metoda.
		int inputTalet=0,storsteTal=0 ,nestStorsteTal=0;
		String inputTaletTXT="",melding="";
		int i=1;  // Må definere denne variabelen her, fordi den blir brukt også utanfor FOR-loopen (linje 34 +- ;) )

		for ( i = 1; i <= 10; i += 1 ){
			inputTaletTXT = JOptionPane.showInputDialog("Gi meg et tal");
			inputTalet = Integer.parseInt(inputTaletTXT);

			if(inputTalet>storsteTal){  // Dersom talet er større enn tidligare største tal, eller dette er første tal.
				// Når vi set eit nytt størstetall, så må først NestStørste få verdien til "det gamle" størstetal.
				nestStorsteTal = storsteTal; // Første runda i loopen, kan vi ikkje definere nest største tal...
				storsteTal=inputTalet;
			}else if(inputTalet>nestStorsteTal){ //Talet kan vere større enn nest-største tal...
				nestStorsteTal = inputTalet;
			}
		}
		// En sjekk på om det er tasta inn tal større enn null ( negative tal bryr vi oss ikkje om idag).
		melding = "Største tall er: "+storsteTal+", og nest største tall er: "+nestStorsteTal;
		if(storsteTal!=0) JOptionPane.showMessageDialog( null, melding );
		else JOptionPane.showMessageDialog( null, "Takk for ingenting, latstokk" );
    } // slutt på main-metoden
 } // slutt på klasse