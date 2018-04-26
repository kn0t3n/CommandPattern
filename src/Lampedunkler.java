public class Lampedunkler implements Command{

    private Lampe lampe;

    public Lampedunkler(Lampe lampe) {
        this.lampe = lampe;
    }

    @Override
    public void execute() {
        lampe.dunkler();
    }
}
