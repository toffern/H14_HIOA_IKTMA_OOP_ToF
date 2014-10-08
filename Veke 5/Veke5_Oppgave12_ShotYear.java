/*
Lag et program som kan fortelle brukeren hvor mange dager det er i en måned. Brukeren skal skrive inn navnet på måneden.
Du trenger ikke ta hensyn til skuddår.
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Veke5_Oppgave12_ShotYear{

	private static String inputAar, mld;
	private static int aar;


	public static void main( String args[]) {
		// Hent inn årstal frå brukaren.

		aar = Integer.parseInt( inputAar	= JOptionPane.showInputDialog("Gi meg eit årstal") );
		mld="";

		// Logikk: ( Delelig på 4 OG ikkje på 100) ELLER ( delelig på 400 )
		if(( aar%4==0 && aar%100!=0 ) || ( aar%400==0 )){
			mld = "Bæng, du har tasta inn eit skotår!";
		}else{
			mld = "Nix,"+aar+" er ikkje eit skotår.";
		}
		JOptionPane.showMessageDialog(null,mld);  // moglege parmeter til metoda (frame, message, messageType, optionType, options, icon, title,initialValue)
	} // Slutt main
} // Slutt klasse