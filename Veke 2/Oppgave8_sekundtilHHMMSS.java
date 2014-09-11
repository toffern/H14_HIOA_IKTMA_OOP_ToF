import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave8_sekundtilHHMMSS
 {
   public static void main(String[] args)
   {
	 int sekund = Integer.parseInt( JOptionPane.showInputDialog("Kor mange sekund har du i skreppa di?") );

	 int minutt = sekund / 60;
	 int timar = minutt / 60;
	 minutt = minutt-(timar*60);
	 sekund = sekund-(timar*3600)-(minutt*60);
	 String utskrift = timar + " t " + minutt + " m "+sekund+" s";
     JOptionPane.showMessageDialog(null, utskrift);

  }
}