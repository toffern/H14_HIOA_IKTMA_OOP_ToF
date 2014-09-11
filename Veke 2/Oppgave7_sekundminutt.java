import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave7_sekundminutt
 {
   public static void main(String[] args)
   {
	 int sekund = Integer.parseInt( JOptionPane.showInputDialog("Kor mange sekund har du i skreppa di?") );

	 int minutt = sekund / 60;
	 String utskrift = sekund + " sekund tilsvarar: " + minutt + " minutt";
     JOptionPane.showMessageDialog(null, utskrift);

  }
}