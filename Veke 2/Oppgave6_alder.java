import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave6_alder
 {
   public static void main(String[] args)
   {
	 String navn = JOptionPane.showInputDialog("Oppgi ditt navn.");
	 int fodselsaar = Integer.parseInt( JOptionPane.showInputDialog("Oppgi ditt fødselsår.") );

	 Calendar datetime = Calendar.getInstance();
	 int aaret = datetime.get(Calendar.YEAR);

	 String utskrift = "Hei "+navn+", du er: "+(aaret-fodselsaar);
     JOptionPane.showMessageDialog(null, utskrift);

  }
}