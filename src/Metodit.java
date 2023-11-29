
public class Metodit {

  public static void tulostaTervehdys() {
    System.out.println("Moi!");

  }
  public static void taydellinenLahja() {

    Lahjakone lahjakone = new Lahjakone();
    String lahja = lahjakone.arvoLahja();
    System.out.println(lahja);
    
  }

  public static void main(String[] args) {
    // Kutsutaan metodia tulostaTervehdys
    tulostaTervehdys();
    taydellinenLahja();
  }

}
