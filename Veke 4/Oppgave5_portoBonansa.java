/*
Lag et applikasjonsprogram som leser inn vekten til et brev i antall hele gram og som skriver ut riktig porto (på grunnlag av portotabellen ovenfor).
Dersom brevet er for tungt, skal melding om dette skrives ut istedenfor portoen.
(Gjør bruk av if- og/eller if-else-setninger.) */

import javax.swing.JOptionPane;


public class Oppgave5_portoBonansa
{
    public static void main( String args[] )
    {
		// Oppdatert 26.sept, har lagt på en sjekk om input=null, altså om nokon vel "Cancel" i dialogboksa.
		String inpVekt = JOptionPane.showInputDialog( "Skriv vekt, i gram, på brevet ditt:" );
		if(inpVekt!=null){
			// inputVekt er ikkje null og dermed køyrer vi på med while.
			Integer vekt = Integer.parseInt(inpVekt);
			while(vekt>0){
				String forTungt = "ikkje"; // Vi antek først at brevet "ikkje" er for tungt.

				double porto = 0.0;

				if ( vekt <= 20 )
					porto = 9.00;
				else if ( vekt <= 50 )
					porto = 14.00;
				else if ( vekt <= 100 )
					porto = 17.00;
				else if ( vekt <= 350 )
					porto = 27.00;
				else if ( vekt <= 1000 )
					porto = 67.00;
				else if ( vekt <= 2000 )
					porto = 145.00;
				else
					forTungt = ""; // Brevet er visst for tungt, tek dermed bort "ikkje" som lenger nede blir skøyta inn i utskrift

				String mld = "Brevet er "+forTungt+" for tungt, og portoen blir dermed: "+porto;
				JOptionPane.showMessageDialog( null, mld, "Brevpris",
										  JOptionPane.INFORMATION_MESSAGE );
				inpVekt = JOptionPane.showInputDialog( "Skriv vekt, i gram, på brevet ditt:");
				// Tek også her ein sjekk på om input er null, og avbryt while-loopen om så er tilfelle.
				if(inpVekt==null) break;
				else vekt = Integer.parseInt(inpVekt);
			}
		}
		JOptionPane.showMessageDialog(null, "Takk for nå","Tænks!", JOptionPane.INFORMATION_MESSAGE);
    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave13_minstetal)