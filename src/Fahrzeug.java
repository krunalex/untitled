public class Fahrzeug {

    private int nummer;
    private int ps;
    private int anzahlraeder;

    public Fahrzeug(int nummer, int ps, int anzahlraeder){
        this.nummer = nummer; //(int) (Math.random() * (1000 - 1) + 1);
        this.ps = ps; //(int) (Math.random() * (201 - 30) + 30);
        this.anzahlraeder = anzahlraeder; //(int) (Math.random() * (5 - 2) + 2);
    }

    public int getNummer() {
        return nummer;
    }

    public int getPs() {
        return ps;
    }

    public int getAnzahlraeder() {
        return anzahlraeder;
    }
}