public class Lahjakone {
    public String arvoLahja() {

        String[] lahja = new String[10];
        lahja[0] = "** Itseään puhdistava lautasliina **:";
        lahja[1] = "** Kaukosäädin kaukosäätimelle **";
        lahja[2] = "** Elokuvalippuja vuoden 1997 elokuviin **";
        lahja[3] = "** Kasvava tuoli **";
        lahja[4] = "** Näkymätön kirja **";
        lahja[5] = "** Hattu, joka vaihtaa väriä sen mukaan, miten tunnet itsesi **";
        lahja[6] = "** Elokuvalippuja vuoden 1997 elokuviin **";
        lahja[7] = "** Puhuva peruna **";
        lahja[8] = "** Taskukokoinen ajanhallintakone **:";
        lahja[9] = "** Puhuva leipälaatikko, joka antaa viisaita neuvoja aina kun avaat sen **:";
        return lahja[(int) (Math.random() * lahja.length)];
    }
    
}
