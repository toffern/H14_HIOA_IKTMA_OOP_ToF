/*
Lag et applikasjonsprogram som leser inn vekten til et brev i antall hele gram og som skriver ut riktig porto (på grunnlag av portotabellen ovenfor).
Dersom brevet er for tungt, skal melding om dette skrives ut istedenfor portoen.
(Gjør bruk av if- og/eller if-else-setninger.) */

import javax.swing.JOptionPane;


public class Oppgave2_portopris
{
    public static void main( String args[] )
    {
		  Integer vekt = Integer.parseInt(JOptionPane.showInputDialog( "Skriv vekt, i gram, på brevet ditt:" ));
		  String forTungt = "ikkje";

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
		  	forTungt = "";

		String mld = "Brevet er "+forTungt+" for tungt, og portoen blir dermed: "+porto;
    	JOptionPane.showMessageDialog( null, mld, "Brevpris",
        							  JOptionPane.INFORMATION_MESSAGE );
    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave13_minstetal)