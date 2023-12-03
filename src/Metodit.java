import java.util.Scanner;

public class Metodit {

    // Tuhma vai kiltti lahjakone
  public static void main(String[] args) {
	  
	  Scanner in = new Scanner(System.in);

    // Kutsutaan metodia tulostaTervehdys
    tulostaTervehdys();
    
    // Kysytään onko ollut kiltti
	  String vastaus = null;
	  System.out.println("Oletko ollut kiltti vuonna 2023?");
	  vastaus = in.nextLine();
    // luetaan vastaus
	  kilttiVaiTuhma(vastaus);
    // lahjakone arpoo sopivan lahjan
    taydellinenLahja();
  } // main sulku

  // Tervehdys
  public static void tulostaTervehdys() {
    System.out.println("Hou Hou! Tervetuloa lahjakoneeseen!");

  }
  // Kiltti vai tuhma?
  public static void kilttiVaiTuhma(String vastaus)
  {
	if(vastaus.equalsIgnoreCase("Kyllä"))
	{
		System.out.println("Mahtavaa! Tässä sinulle upea, ainutlaatuinen lahja!");
	}
	else if((vastaus.equalsIgnoreCase("Ei")) || (vastaus.equalsIgnoreCase("En")))
	{
		System.out.println("Soo, soo. Tässä tuhmeliineille sopiva lahja.");
	}	
	}
  
  // Arvotaan lahja
  public static void taydellinenLahja() {

    Lahjakone lahjakone = new Lahjakone();
    String lahja = lahjakone.arvoLahja();
    System.out.println(lahja);
    
  }


  

}
