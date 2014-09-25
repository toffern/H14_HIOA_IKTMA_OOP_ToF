import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave8_sekundtilHHMMSS
 {
   public static void main(String[] args)
   {
	 int inputSekund = Integer.parseInt( JOptionPane.showInputDialog("Kor mange sekund har du i skreppa di?") );

	 int timar = inputSekund / 3600;
	 int minutt = inputSekund%(timar*60);
	 int sekund = inputSekund%60;

	 String utskrift = timar + " t " + minutt + " m "+sekund+" s";
     JOptionPane.showMessageDialog(null, utskrift);

  }
}