/*
Lag et program som kan fortelle brukeren hvor mange dager det er i en m�ned. Brukeren skal skrive inn navnet p� m�neden.
Du trenger ikke ta hensyn til skudd�r.
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Veke5_Oppgave12_ShotYear{

	private static String inputAar, mld;
	private static int aar;


	public static void main( String args[]) {
		// Hent inn �rstal fr� brukaren.

		aar = Integer.parseInt( inputAar	= JOptionPane.showInputDialog("Gi meg eit �rstal") );
		mld="";

		// Logikk: ( Delelig p� 4 OG ikkje p� 100) ELLER ( delelig p� 400 )
		if(( aar%4==0 && aar%100!=0 ) || ( aar%400==0 )){
			mld = "B�ng, du har tasta inn eit skot�r!";
		}else{
			mld = "Nix,"+aar+" er ikkje eit skot�r.";
		}
		JOptionPane.showMessageDialog(null,mld);  // moglege parmeter til metoda (frame, message, messageType, optionType, options, icon, title,initialValue)
	} // Slutt main
} // Slutt klasse