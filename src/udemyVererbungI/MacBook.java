package udemyVererbungI;

public class MacBook extends Laptop{

    private boolean touchBar;

    public MacBook(String marke, int ram, String cpu, double preis, boolean touchBar){
        super(marke,ram,cpu,preis);
        this.touchBar = touchBar;
    }
}