import java.util.Scanner;

public class Metodit {

  public static void tulostaTervehdys() {
    System.out.println("Moi!");

  }
  
  public static void kilttiVaiTuhma(String vastaus)
  {
	if(vastaus.equalsIgnoreCase("Kyllä"))
	{
		System.out.println("Mahtavaa! Tässä sinulle upea, ainutlaatuinen lahja!");
	}
	else if(vastaus.equalsIgnoreCase("Ei"))
	{
		System.out.println("Soo, soo. Tässä tuhmeliineille sopiva lahja.");
	}	
	}
  
  public static void taydellinenLahja() {

    Lahjakone lahjakone = new Lahjakone();
    String lahja = lahjakone.arvoLahja();
    System.out.println(lahja);
    
  }

  public static void main(String[] args) {
	  
	Scanner in = new Scanner(System.in);
    // Kutsutaan metodia tulostaTervehdys
    tulostaTervehdys();
    
	String vastaus = null;
	
	System.out.println("Oletko ollut kiltti vuonna 2023?");
	vastaus = in.nextLine();
	
	kilttiVaiTuhma(vastaus);
    
    taydellinenLahja();
  }

}
