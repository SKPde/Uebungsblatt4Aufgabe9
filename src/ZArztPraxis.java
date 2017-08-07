import java.util.Scanner;

public class ZArztPraxis {  
  private static Scanner in;

public static void warteZimmer (WarteSchlange wl) {
	in = new Scanner(System.in);
    int aktion = 0; 
    int jahr;
    String name;
    ZPatient p;
    do {
      System.out.println("Moegliche Aktionen:");
      System.out.println(" Patient anmelden (1)," +
                         " Patient drannehmen (2)," + 
                         " Programmende (0)");
      System.out.print("Ihre Wahl: ");
      aktion = in.nextInt();
      if (aktion == 1) {
        System.out.print("Patienten-Aufnahme:");
        System.out.print("Name: ");
        name = (String) in.next();
        System.out.println("                   ");
        System.out.println("Geburtsjahr: ");
        jahr = (int) in.nextInt();
        p = new ZPatient(name,jahr);
        wl.anmelden(p);
      }
      else if (aktion == 2) {
        p = wl.derNaechsteBitte();
        if (p == null)
          System.out.println("Keine Patienten mehr im Wartezimmer!");
        else {
          System.out.print("Es kommt dran:  ");
          System.out.println(p);
        }
      }
    } while (aktion != 0);
  }
}
