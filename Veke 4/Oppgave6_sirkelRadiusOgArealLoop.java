/* OPPGAVETEKST:
[...] program som leste inn radien til en sirkel og skrev ut sirkelens areal.
Lag en ny versjon av dette programmet ved at programmet også beregner og skriver ut sirkelens omkrets.
(Formelen for omkrets er 2 * ? * r.)
Dessuten skal innlesing av radius og utskrift av areal og omkrets foretas gjentatte ganger,
inntil det leses inn en negativ verdi for radien */

import javax.swing.JOptionPane;
import java.text.DecimalFormat; // For å styre antal desimalar på double-verdiar


public class Oppgave6_sirkelRadiusOgArealLoop
{
    public static void main( String args[] )
    {
		String inputRadius = JOptionPane.showInputDialog( "Oppgi radius:" );
		if(inputRadius!=null){
			// inputRadius er ikkje null og dermed køyrer vi på med while.
			Double radius = Double.parseDouble(inputRadius);
			while(radius>0){

				double areal = radius*radius*3.14;
				double omkrets = 2*3.14*radius;

				DecimalFormat formateringsobjekt = new DecimalFormat( "0.00" );
				String formatertAreal = formateringsobjekt.format( areal );
				String formatertOmkrets = formateringsobjekt.format( omkrets );


				String mld = "Sirkelinfo: \n Areal: "+formatertAreal+" \n Omkrets:"+formatertOmkrets;
				JOptionPane.showMessageDialog( null, mld, "Sirkelinfo AS, One infinite loop.",
										  JOptionPane.INFORMATION_MESSAGE );
				inputRadius = JOptionPane.showInputDialog( "Oppgi ny radius, om du vil ha meir juicy sirkelinfo:");
				// Tek også her ein sjekk på om input er null, og avbryt while-loopen om så er tilfelle.
				if(inputRadius==null) break;
				else radius = Double.parseDouble(inputRadius);
			}
		}
		JOptionPane.showMessageDialog(null, "Takk for nå","Tænks!", JOptionPane.INFORMATION_MESSAGE);
    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave13_minstetal)