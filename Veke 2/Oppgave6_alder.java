import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave6_alder
 {
   public static void main(String[] args)
   {
	 String navn = JOptionPane.showInputDialog("Oppgi ditt navn.");
	 int fodselsaar = Integer.parseInt( JOptionPane.showInputDialog("Oppgi ditt fødselsår.") );

	// Lag en instans av type kalender.
	 Calendar datetime = Calendar.getInstance();
	 int aaretViErI = datetime.get(Calendar.YEAR);
	 	/* Link til andre kalender-felt (mandag, dag, day_of_week, hour_of_day, etc:
	 		http://docs.oracle.com/javase/1.5.0/docs/api/constant-values.html#java.util.Calendar.PM  		*/

	 String utskrift = "Hei "+navn+", du er: "+(aaretViErI-fodselsaar);
     JOptionPane.showMessageDialog(null, utskrift);

  }
}