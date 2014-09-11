import javax.swing.JOptionPane;

public class Oppgave2
 {
   public static void main(String[] args)
   {
	 String fNavn = JOptionPane.showInputDialog("Kva er ditt fornavn?");
	 String eNavn = JOptionPane.showInputDialog("Kva er ditt etternavn?");
	 String utskrift = "Hei på deg  " + fNavn + " "+ eNavn;
     JOptionPane.showMessageDialog(null, utskrift);
  }
}