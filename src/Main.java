public class Main {

    public static void main(String[] args) {
        Lampe lampe = new Lampe();

        LampeAn lampeAn = new LampeAn(lampe);
        Taste tasteAnDruecken = new Taste(lampeAn);
        tasteAnDruecken.gedrueckt();

        LampeAus lampeAus = new LampeAus(lampe);
        Taste tasteAusDruecken = new Taste(lampeAus);
        tasteAusDruecken.gedrueckt();
    }
}
