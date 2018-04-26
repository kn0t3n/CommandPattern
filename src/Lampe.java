public class Lampe {

    private int helligkeit;

    public void an(){
        System.out.println("Die Lampe ist an");
    }

    public void aus(){
        System.out.println("Die Lampe ist aus");
    }

    public void heller(){
        helligkeit++;
        System.out.println("Die Lampe wird heller");
    }

    public void dunkler(){
        helligkeit--;
        System.out.println("Die Lampe wird dunkler");
    }

}
