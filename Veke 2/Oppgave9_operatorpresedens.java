import javax.swing.JOptionPane;
import java.util.Calendar;

public class Oppgave9_operatorpresedens
 {
   public static void main(String[] args)
   {
	Integer a = 8 * 6 / 3;
	Integer b = 64 % 2;
	Double c = 18.0 / 6;
	Integer d = 10 * 3 - 4;
	Integer e = 17 / 9;
	Integer f = 48  / 7 * 2;
	Integer g = 3 * (17 / 3) + 17 % 3;
	Double h = 19.0 / 4.0;
	Integer i = 92 - 3 * 4;
	Integer j = 10 % 3;

	 String utskrift = "a:"+a+",b:"+b+",c:"+c+",d:"+d+",e:"+e+",f:"+f+",g:"+g+",h:"+h+",i:"+i+",j:"+j;
     JOptionPane.showMessageDialog(null, utskrift);

  }
}