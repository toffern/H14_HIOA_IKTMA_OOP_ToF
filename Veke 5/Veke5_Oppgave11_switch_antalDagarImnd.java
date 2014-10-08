/*
Lag et program som kan fortelle brukeren hvor mange dager det er i en måned. Brukeren skal skrive inn navnet på måneden.
Du trenger ikke ta hensyn til skuddår.
*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Veke5_Oppgave11_switch_antalDagarImnd{

	private static String inputMndNavn, ukedagNavn, mld, antalDager;


	public static void main( String args[]) {
		inputMndNavn	= JOptionPane.showInputDialog("Gi meg eit månadsnavn, pliiz");

		//String mld = Integer.toString(inputUkedag);
		ukedagNavn="";
		mld="";
		antalDager="";

		switch(inputMndNavn){

			case "januar":
			case "mars":
			case "mai":
			case "juli":
			case "august":
			case "oktober":
			case "desember":
					antalDager= "31";
					break;
			case "april":
			case "juni":
			case "september":
			case "november":
					antalDager= "30";
					break;
			case "februar":
					antalDager= "29/28";
					break;
			default:
					mld= " ukjent månad det der...";
		}

		if(antalDager!="") mld = "Antal dagar i "+inputMndNavn+" er "+antalDager;

		JOptionPane.showMessageDialog(null,mld);  // moglege parmeter til metoda (frame, message, messageType, optionType, options, icon, title,initialValue)
	} // Slutt main
} // Slutt klasse