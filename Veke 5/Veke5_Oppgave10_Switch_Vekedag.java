/*
Lag et program som gjentatte ganger leser inn nummeret til en ukedag, der 1 svarer til mandag, 2 til tirsdag, og så videre, inntil 7 for søndag.
For hvert innlest nummer skal programmet skrive ut navnet på vedkommende ukedag, altså "mandag" i tilfelle det blir lest inn 1, "tirsdag" når det blir lest inn 2, og så videre.
Dersom det blir lest inn et tall større enn 7, skal teksten "ukjent ukedag" skrives ut.
Dersom det blir lest inn 0 eller en negativ verdi, skal programmet avslutte. Bruk en switch-setning til å avgjøre hva som skal skrives ut.
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Veke5_Oppgave10_Switch_Vekedag{

	public static void main( String args[]) {
		Integer inputUkedag = Integer.parseInt( JOptionPane.showInputDialog("Kva nummer ukedag vil du ha? Velg 0 eller negativt tal for å slutte") );
		//String mld = Integer.toString(inputUkedag);

		String ukedagNavn="", mld="";

		while(inputUkedag>0){

			switch(inputUkedag){

				case 1:
						ukedagNavn = "Måndag";
						break;
				case 2:
						ukedagNavn = "tysdag";
						break;
				case 3:
						ukedagNavn = "onsdag";
						break;
				case 4:
						ukedagNavn = "torsdag";
						break;
				case 5:
						ukedagNavn = "fræddan";
						break;
				case 6:
						ukedagNavn = "laugardag";
						break;
				case 7:
						ukedagNavn = "sundag";
						break;
				default:
						mld = "<frekkas> No har du rota litt oppi det vesle hovudet ditt, kjære ven. Ukjent ukedag! </frekkas>";
			}
			if(inputUkedag<=7) mld = " Du valgte "+ukedagNavn;

			JOptionPane.showMessageDialog(null,mld);  // moglege parmeter til metoda (frame, message, messageType, optionType, options, icon, title,initialValue)
			inputUkedag = Integer.parseInt( JOptionPane.showInputDialog("Kva nummer ukedag vil du ha? Velg 0 eller negativt tal for å slutte") );

		}

	}

}