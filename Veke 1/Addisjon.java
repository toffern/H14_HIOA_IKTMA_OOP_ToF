import javax.swing.JOptionPane;

public class Addisjon
{
   public static void main( String args[] )
   {
      String forsteSifferstreng;
      String andreSifferstreng;

      int forstetall;
      int andretall;
      int sum;

      // Leser inn forste tall fra bruker i form av en sifferstreng:
      forsteSifferstreng = JOptionPane.showInputDialog( 
      		"Skriv inn forste hele tall" );

      // Leser inn andre tall fra bruker i form av en sifferstreng:
      andreSifferstreng =
         JOptionPane.showInputDialog( "Skriv inn andre hele tall" );

      // Konverterer sifferstrengene til tallverdier:
      forstetall = Integer.parseInt( forsteSifferstreng );
      andretall = Integer.parseInt( andreSifferstreng );

      // Adderer tallene og lagrer summen i variabelen sum:
      sum = forstetall + andretall;

      // Viser resultatet:
      JOptionPane.showMessageDialog( null, "Summen er " + sum,
         "Resultater", JOptionPane.PLAIN_MESSAGE );
   } // slutt på main-metoden
}  // slutt på klassen Addisjon