/* OPPGAVETEKST:
Lag et program som beregner og skriver ut (i en dialogboks) summen
  2 + 4 + 6 + 8 + ... + 98    */


import javax.swing.JOptionPane;
import java.text.DecimalFormat; // For å styre antal desimalar på double-verdiar


public class Veke5_Oppgave1_2gangen
{
    public static void main( String args[] )
    {
		String utregning = "", melding="";
		int sum = 0;

		for ( int i = 2; i <= 100; i += 2 ){
			// kodeblokk  {}
			utregning += i + " + ";
			sum = sum + i; // sum += i;
		}

		melding = "Summen blir: "+ sum +" når utrekninga er: "+utregning;
		JOptionPane.showMessageDialog( null, melding );

    } // slutt på main-metoden
 } // slutt på klassen Sammenlikning (oppgave13_minstetal)